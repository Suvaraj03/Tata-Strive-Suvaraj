package sampleProject;

import java.util.Scanner;
import java. lang.String;

public class index {
	public static void main(String[] args) {
		int country;
//		String arr[] = {"Seychelles","Hong kong","Maldives","Australia","Europe"};
		int arr[]= {2,5,7,8,5,3,1,0,9,};
		int index =-1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the index :");
		int count=	1;
		country=arr.length;
		for(int i =0;i<country;i++) {
			if (arr[i]==count) {
				index =i ;
				break;
			}
		}
		System.out.println("index of " + count + "is:" + index);	
	}

}
//public class index{
//	public static void main(String[] args) {
//		String s= "yeah,its a rainy season";
//		char []arr=s.toCharArray();
//		int i;
//		for(i=0;i<arr.length;i++) {
//			if(arr[i]==' ') {
//				System.out.println(' ');
//			}
//			else {
//				System.out.println(arr[i]);
//			}
//		}
//	}
//}