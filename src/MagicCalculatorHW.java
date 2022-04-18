import java.util.ArrayList;


public class MagicCalculatorHW extends JavaCalculatorHW {

	 
	double SquareRoot(int num1) {
		 return(Math.sqrt(num1));
	 }
	double sin(double num1) {
		 return(Math.sin(Math.toRadians(num1)));
	 }

	 double cosine(double num1) {
		 return(Math.cos(Math.toRadians(num1)));
	 }
	 
	 double tangent(double num1) {
		 return(Math.tan(Math.toRadians(num1)));
	 }
	 
	 ArrayList<Integer> factorial(int num1) {
		 ArrayList<Integer> factNum = new ArrayList<>();
		 for (int i = 1; i <= num1; ++i) {

		      // if number is divided by i
		      // i is the factor
		   if (num1 % i == 0) {
		      factNum.add(i);
		   }
	     }
		 return factNum;
		 
	 }
	 
	 public static void main(String[] args) {
		 
		MagicCalculatorHW trig = new MagicCalculatorHW();
		 
		System.out.println(trig.add(18,3));
		System.out.println(trig.subtract(25,4));
		System.out.println(trig.multiply(7,3));
		System.out.println(trig.divide(126,6));
		System.out.println(trig.square(9));
		System.out.println(trig.sin(75.0));
		System.out.println(trig.cosine(25.0));
		System.out.println(trig.tangent(90.0));
		System.out.println(trig.SquareRoot(121));
		System.out.println(trig.factorial(12));
	 }
	 
}