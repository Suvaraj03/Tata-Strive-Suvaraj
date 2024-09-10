package AbstractMethod;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stu=null;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Student ID :");
		int studentId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Student Name :");
		String studentName=sc.nextLine();
		
		System.out.println("Enter the Department :");
		String department=sc.nextLine();
		
		System.out.println("Enter the Gender :");
		String gender=sc.nextLine();
		
		System.out.println("Enter the Category (DayScholar/Hosteller):");
		String category=sc.nextLine();
		
		System.out.println("Enter the College Fees :");
		double collegeFee=sc.nextDouble();
		
		
		
		if(category.equals("Hosteller")) {
			System.out.println("Enter the Room Number :");
			int roomNumber=sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the Block Name :");
			char blockName=sc.nextLine().charAt(0);
			sc.nextLine();

			System.out.println("Enter the Room Type :");
			String roomType=sc.nextLine();
			
			Hosteller hostel =new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber, blockName, roomType);
			System.out.println("The TotalFees is "+hostel.calculateTotalFee());
		}
		else if(category.equals("DayScholar")) {
			System.out.println("Enter the Bus Number :");
			int busNumber=sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the Distance :");
			float distance=sc.nextFloat();
			DayScholar day = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
			System.out.println("The TotalFees is "+day.calculateTotalFee());
		}
		else {
			System.out.println("Invalid Category");
		}
	
		}

}
