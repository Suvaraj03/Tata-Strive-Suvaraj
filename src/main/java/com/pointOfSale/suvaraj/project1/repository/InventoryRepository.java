package com.pointOfSale.suvaraj.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pointOfSale.suvaraj.project1.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	
	
		
}
