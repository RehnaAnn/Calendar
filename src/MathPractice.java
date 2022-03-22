/*
Author: Rehna Anthru
Sub: Math class and operations
Date: 03/21/2022
 */

public class MathPractice {

	public static void main(String[] args) {

		double x = 18;
		double y = 2;
		double z = 3.35;

		// Maximum of x and y
		System.out.println("Maximum number of x and y is : " + Math.max(5, 10));

		//Square root of Y
		System.out.println("Square root of y is: " + Math.sqrt(y));  

		//returns 28 power of 4 (28*28*28*28)  
		System.out.println("Power of x and y is: " + Math.pow(x, y));      

		// return the logarithm of given value       
		System.out.println("Logarithm of x is: " + Math.log(x));   
		System.out.println("Logarithm of y is: " + Math.log(y));  

		// return the logarithm of given value when the base is 10      
		System.out.println("log10 of x is: " + Math.log10(x));   
		System.out.println("log10 of y is: " + Math.log10(y));    

		// return the log of x + 1  
		System.out.println("log1p of x is: " +Math.log1p(x));    

		//Exercise #2

		// return x power of 2    
		System.out.println("exp of x is: " +Math.exp(x));    

		// return (x power of 2)-1  
		System.out.println("expm1 of x is: " +Math.expm1(x));  

		// return the trigonometric sine of x      
		System.out.println("Sine value of x is: " +Math.sin(x));    

		// return the trigonometric cosine value of x  
		System.out.println("Cosine value of x is: " +Math.cos(x));  

		// return the trigonometric tangent value of x 
		System.out.println("Tangent value of x is: " +Math.tan(x));  

		// return the trigonometric arc sine of x      
		System.out.println("Sine value of x is: " +Math.asin(x));    

		// return the trigonometric arc cosine value of x  
		System.out.println("Cosine value of x is: " +Math.acos(x));  

		// return the trigonometric arc tangent value of x  
		System.out.println("Tangent value of x is: " +Math.atan(x));  

		// return the hyperbolic sine of x     
		System.out.println("Sine value of x is: " +Math.sinh(x));    

		// return the hyperbolic cosine value of x  
		System.out.println("Cosine value of x is: " +Math.cosh(x));  

		// return the hyperbolic tangent value of x  
		System.out.println("Tangent value of x is: " +Math.tanh(x)); 

		//Exercise #3

		//return the Absolute value of a given value
		System.out.println("Absolute value of z is: "+Math.abs(z));

		//return the round of the decimal numbers to the nearest value.
		System.out.println("Round value of z is: "+Math.round(z));

		//return the cube root of a number
		System.out.println("Cube root of y is: "+Math.cbrt(y));

		//return the smallest integer value that is greater than or equal to the argument or mathematical integer.
		System.out.println("Smallest integer value of z is : "+Math.ceil(z));

		// return the largest integer value which is less than or equal to the argument and is equal to the mathematical integer of a double value.
		System.out.println("Largest integer value of z is : "+Math.floor(z));
		

	}

}
