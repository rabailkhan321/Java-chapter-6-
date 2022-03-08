//program to find maximum number(user inputs 3 numbers)


import java.util.Scanner;
public class Maximum {
	public static void main(String[] args )
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println ("enter any three numbers");
		
		double num1= input.nextDouble();
		double num2= input.nextDouble();
		double num3= input.nextDouble();
		
		
		
		
		
	
		
		 
double result = maximum (num1, num2, num3);
		
		
		
			System.out.printf("max number is %f", result );
		
	}
	
	public static double maximum(double x, double y, double z)
	{
		
		double max = x;
		if (y > max)
			max = y;
		 if (z > max )
			max = z;
		return max;
	}
}