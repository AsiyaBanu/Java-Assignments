import java.util.Scanner;
public class SwitchcaseDemo {
	
    public static void evenOdd(int evenoddno) {
    	if(evenoddno%2==0) {
	          System.out.println(evenoddno+" is Even number");
           }
       else {
      	 System.out.println(evenoddno+" is Odd number");
       }
    	
    }
    public static void positiveNegative(int posnegno) {
    	if(posnegno<0) {
	          System.out.println(posnegno+" is Negative number");
           }
       else {
      	 System.out.println(posnegno+" is Positive number");
       }
    	
    }
    public static void checkPrime(int prime){  
    	  int i,m=0,flag=0;      
    	  m=prime/2;      
    	  if(prime==0||prime==1)
    	  {  
    	   System.out.println(prime+" is not Prime number");      
    	  }
    	  else
    	  {  
    	     for(i=2;i<=m;i++)
    	     {      
    	        if(prime%i==0)
    	        {      
    	            System.out.println(prime+" is not Prime number");      
    	            flag=1;      
    	            break;      
    	        }      
    	   }      
    	   if(flag==0)
    	   {
    		   System.out.println(prime+" is Prime number"); 
    	    }  
    	  }
    }
    
	public static void main(String[] args) {
		int response;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter a number from(1 to 6):\n1.Addition of Two Numbers\n2.Average of Two numbers\n3.To Check whether a number is Even or Odd\n4.To check whether a number is Positive or Negative\n5.To check whether a number is Prime or not\n6.Exit");
			int n=scanner.nextInt();
			
		switch(n) {
		case 1:
			        System.out.println("Enter first number:");
			        int num1=scanner.nextInt();
			        System.out.println("Enter second number");
			        int num2=scanner.nextInt();
			        int add=num1+num2;
			        System.out.println("Result of Addition is:"+add);
		            break;
		case 2:
			      System.out.println("Enter first number:");
	              int no1=scanner.nextInt();
	              System.out.println("Enter second number");
	              int no2=scanner.nextInt();
	              float average=((no1+no2)/2.0f);
	              System.out.println("Result of Average is:"+average);
	              break;
		case 3:
			     System.out.println("Enter a number to check whether it is even or odd:");
	             int evenoddno=scanner.nextInt();
	             evenOdd(evenoddno);
		         break;
		case 4:
			     System.out.println("Enter a number to check whether it is positive or negative:");
	             int posnegno=scanner.nextInt();
	             positiveNegative(posnegno);
		         break;
		case 5:
			    System.out.println("Enter a number to check whether it is prime or not:");
	            int prime=scanner.nextInt();
	            checkPrime(prime);
		        break;
		case 6:System.exit(0);
		default:System.out.println("Invalid choice");
			      
		       
		}System.out.println("Do you like to continue: 1.Yes 2.No");
		response=scanner.nextInt();
		}
		while(response==1);
		

	}

}
