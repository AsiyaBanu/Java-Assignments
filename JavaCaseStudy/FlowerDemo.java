package CaseStudy;


import java.util.Scanner;

public class FlowerDemo {
	 static void displayFlowers(int num) 
     { 
     
       switch (num) {
       case '1':
			       	 System.out.println("Continent Name : ASIA");
			       	 System.out.println("Country Name    "+ "      National Flower");
			         System.out.println(" INDIA  "+ "              LOTUS");
			         System.out.println(" PAKISTAN  "+ "           JASMINE");
			         System.out.println(" NEPAL  "+ "              LALI GURAS");
			         break;

       case '2':
			       	System.out.println("Continent Name : EUROPE");
			      	System.out.println("Country Name  "+ "      National Flower");
			   		System.out.println(" GERMANY  "+ "               CORN FLOWER");
			   		System.out.println(" FRANCE   "+ "               LILY");
			   		System.out.println(" GREECE  "+ "                ACANTHUS MOLLIS");
                    break;

       case '3':
       	
			       	System.out.println("Continent Name : AFRICA");
			      	System.out.println("Country Name  "+ "      National Flower");
			   		System.out.println(" EGYPT  "+ "               BLUE LOTUS");
			   		System.out.println(" NIGERIA    "+ "           YELLOW TRUMPET");
			   		System.out.println(" KENYA   "+ "              ORCHID");
   		            break;


       case '4':
                      System.exit(0);
			           break;

       default:
           System.out.println("Invalid");
           break;
   }
   }
	

	public static void main(String[] args) {
		char num;
		Scanner s= new Scanner(System.in);
		boolean result = true;
		System.out.println("*****COUNTRY NAME AND NATIONAL FLOWER NAME DATA*****"); 
		do {
	    System.out.println("Choose an Continent Name So that Country Name and National Flower Data is Printed: \n 1. ASIA  \n 2. EUROPE \n 3. AFRICA \n 4. Exit");
	    System.out.println("Enter number between 1-4 to view the Country name and National Flower Data");
	    num = s.next().charAt(0);
		displayFlowers(num); 
	   } while (result);
	}

}
