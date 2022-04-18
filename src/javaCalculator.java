import java.util.Scanner;

public class javaCalculator {

	    public static void main(String[] args) 
	    {
	        int x;
	        int y;
	        String operation;

	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Please enter the first number ");
				x=input.nextInt();

				System.out.println("Please enter the desired operation ");
				operation = input.next();
				
				System.out.println("Please enter the second number ");
				y=input.nextInt();
				}
	
		        if (operation.equals("+"))
		        {
		            System.out.println("Your result is " + (x+y));
		        }
		        if  (operation.equals("-"))
		        {
		            System.out.println("Your result is " + (x-y));
		        }
		        if (operation.equals("*"))
		        {
		            System.out.println("Your result is " + (x*y));
		        }
		        if (operation.equals("/"))
		        {
		            System.out.println("Your result is " + (x/y));
		        }

	    }
	
}
