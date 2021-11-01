package CaseStudy;

import java.util.Scanner;

public class EnjoyRide {
	static void alibaba(int hours,int adult,int children) {
		System.out.println("Ride name is:Alibaba ");
		int adultprice=50;
        int childprice=40;
        System.out.println("Total hours of ride is:"+hours);
        if(hours==1) {
		    int a1=adult*adultprice;
		    int c1=children*childprice;
		    int total=a1+c1;
	        System.out.println("Adult Ride Fare:$"+a1);
	        System.out.println("Children Ride Fare:$"+c1);
	        System.out.println("Total amount:$"+total);
	       }
	  else if(hours>1) {
		  int a11=adult*adultprice*2;
		    int c11=children*childprice*2;
		    int total1=a11+c11;
		System.out.println("Adult Ride Fare:$"+a11);
        System.out.println("Children Ride Fare:$"+c11);
        System.out.println("Total amount:$"+total1);
	       }
	else {
		System.out.println("Invalid");
     }
	}
	static void alpineslide(int hours,int adult,int children) {
		        System.out.println("Ride name is:Alpine Slide");
				int adultprice2=60;
		        int childprice2=30;
		        System.out.println("Total hours of ride is:"+hours);
		        if(hours==1) {
				    int a1=adult*adultprice2;
				    int c1=children*childprice2;
				    int total=a1+c1;
			        System.out.println("Adult Ride Fare:$"+a1);
			        System.out.println("Children Ride Fare:$"+c1);
			        System.out.println("Total amount:$"+total);
			       }
			  else if(hours>1) {
				  int a11=adult*adultprice2*2;
				    int c11=children*childprice2*2;
				    int total1=a11+c11;
				System.out.println("Adult Ride Fare:$"+a11);
		        System.out.println("Children Ride Fare:$"+c11);
		        System.out.println("Total amount:$"+total1);
			       }
			else {
				System.out.println("Invalid");
     }
	}
	static void bumppercars(int hours,int adult,int children) {
		        System.out.println("Ride name is:Bumpper Cars");
				int adultprice3=45;
		        int childprice3=25;
		        System.out.println("Total hours of ride is:"+hours);
		        if(hours==1) {
				    int a1=adult*adultprice3;
				    int c1=children*childprice3;
				    int total=a1+c1;
			        System.out.println("Adult Ride Fare:$"+a1);
			        System.out.println("Children Ride Fare:$"+c1);
			        System.out.println("Total amount:$"+total);
			       }
			  else if(hours>1) {
				  int a11=adult*adultprice3*2;
				    int c11=children*childprice3*2;
				    int total1=a11+c11;
				System.out.println("Adult Ride Fare:$"+a11);
		        System.out.println("Children Ride Fare:$"+c11);
		        System.out.println("Total amount:$"+total1);
			       }
			else {
				System.out.println("Invalid");
		     }
	}
	static void baloonrace(int hours,int adult,int children) {
		        System.out.println("Ride name is:Baloon Race");
				int adultprice4=70;
		        int childprice4=60;
		        System.out.println("Total hours of ride is:"+hours);
		        if(hours==1) {
				    int a1=adult*adultprice4;
				    int c1=children*childprice4;
				    int total=a1+c1;
			        System.out.println("Adult Ride Fare:$"+a1);
			        System.out.println("Children Ride Fare:$"+c1);
			        System.out.println("Total amount:$"+total);
			       }
			  else if(hours>1) {
				  int a11=adult*adultprice4*2;
				    int c11=children*childprice4*2;
				    int total1=a11+c11;
				System.out.println("Adult Ride Fare:$"+a11);
		        System.out.println("Children Ride Fare:$"+c11);
		        System.out.println("Total amount:$"+total1);
			       }
			else {
				System.out.println("Invalid");
		     }
	}
	
	
	
		
		
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean res=true;
		System.out.println("How many Adults are there?");
	    int adult=sc.nextInt();
		System.out.println("How many Children are there?");
		int children=sc.nextInt();
		System.out.println("How many hours you  want to take ride");
        int hours=sc.nextInt();
		do{
			    
				System.out.println("Choose the name of the Ride\n1.Alibaba\n2.Alpine slide\n3.Bumpper Cars\n4.Baloon Race\n5.Exit");
				System.out.println("Enter number between 1-5:");
				int num=sc.nextInt();
				
		        switch(num) {
		        case 1:alibaba(hours,adult,children);
		               break;
		        case 2:alpineslide(hours,adult,children);
	                  break;
		        case 3:bumppercars(hours,adult,children);
                       break;
		        case 4:baloonrace(hours,adult,children);
                       break;
		        case 5:System.exit(0);
                       break;
               default:System.out.println("Invalid Choice");
                     break;
                       
		        }
		}while(res);

	}

}
