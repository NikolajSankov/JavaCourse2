package Factorial;

public class Calculation {
	public static void main(String[] args) {
		int a = fact(4);
	    System.out.println("The factorial of the number is : " + a);
	}
	public static int fact(int n) {
       int result;
       if(n==1) {
         return 1;
       }
       result = fact(n-1) * n;
       return result;
    }
}
