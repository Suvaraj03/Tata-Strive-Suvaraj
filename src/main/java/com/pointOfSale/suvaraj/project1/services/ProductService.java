package com.pointOfSale.suvaraj.project1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pointOfSale.suvaraj.project1.entity.Inventory;
import com.pointOfSale.suvaraj.project1.entity.Product;
import com.pointOfSale.suvaraj.project1.entity.SaleItem;
import com.pointOfSale.suvaraj.project1.repository.ProductRepository;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		for(Inventory invent:product.getInventory()) {
			invent.setProduct(product);
			for(SaleItem saleItem:product.getSaleItem()) {
				saleItem.setProduct(product);				
			}
		}
		return repo.save(product);
	}

	@Override
	public Product getProduct(long id) {
		if (repo.findById(id).isEmpty()) {
			throw new RuntimeException("Invalid ID...Entered ID is not found,Please enter valid Id");
		} else {

			return repo.findById(id).get();
		}
	}

	@Override
	public List<Product> getProducts() {
		
		return repo.findAll();
	}

	@Override
	public Product updateProduct(long id, Product product) {
		if(repo.findById(id).isEmpty()){
			throw new RuntimeException("Product  ID is not found");
		}
		else {
			product.setId(id);
			addProduct(product);
		}
		return product;
	}

	@Override
	public String deleteProduct(long id) {
		repo.deleteById(id);
		return "Deleted Product Successfully";
	}

}
