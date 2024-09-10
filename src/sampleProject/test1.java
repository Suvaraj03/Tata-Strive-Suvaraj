package sampleProject;
import java.util.Scanner;
import java.lang.Math.*;

// class test1{
//  public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int n=sc.nextInt();
//		//int prime_Number=sc.nextInt();
//
//		}
//  
//  public static boolean isPrime(int n) {
//		while(n<=1) {
//			return false;
//		}
//		for(int i=2;i<Math.isPrime(n);i++) {
//		return true;
//		if(n%i==1) {
//			System.out.println("not prime");
//		}
//	}
//	}
//}
public class test1{
	public static void main(String[] args) {
		int a,b;
		for (a=2; a<=50 ; a++) {
			{
				for(b=2;b<a;b++)
				{
					if (a%b==0)
						break;
				}
				if(a==b)
					System.out.println(a);
			}
		}
	}
}
