package CaseStudy;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		
		System.out.println("****Enter Employee Details***");
	System.out.println("Enter the number of employees:");
		int n=sc.nextInt();
	    for(int i=0;i<n;i++) {
		System.out.println("Enter Employee ID:");
		e.setEmployeeId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		e.setEmployeeName(sc.nextLine());
		System.out.println("Enter Basic Salary:");
		e.setBasicSalary(sc.nextFloat());
		e.setTravelAllowance(.2*e.getBasicSalary());
	    
		System.out.println("****Employee Details are as follows*******");
		System.out.println("Employee Id:"+e.getEmployeeId()+"\nEmployee Name :"+e.getEmployeeName()+"\nBasic Salary:"+e.getBasicSalary());
		System.out.println("Net Salary : "+e.calculateNetSalary());
		System.out.println("******Finish*****");
		}
		}
	}

	


