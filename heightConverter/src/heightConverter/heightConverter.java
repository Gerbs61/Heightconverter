package heightConverter;

import java.util.Scanner;

public class heightConverter
	{
		public static double feet;
		public static double inches;
		public static double totalheight;
		public static double centimeters;
		public static double meters;
		public static void main(String[] args)
			{
			double feet = inputFeet();
			double inches = inputInches();
			double totalInches = convertToInches(feet, inches);
			double centimeters = convertTocentimeters(totalInches);
			double meters =  convertTometers(centimeters);
			double newfeet =  convertTofeet(meters);
			double newInches =  convertToTotalinches(newfeet);
			double totalInches1 = totalInches(feet, inches);
			}
		public static double inputFeet()
		{
			System.out.println("Input your height in feet rounded down.");
			Scanner userInput = new Scanner(System.in);
			feet = userInput.nextDouble ();
			return userInput.nextDouble ();
		}
		public static double inputInches()
		{
			System.out.println("And how many inches?");
			Scanner userInput = new Scanner(System.in);
			inches = userInput.nextDouble ();
			return userInput.nextDouble ();
		}
		public static double convertToInches(double x, double y)
		{
			
			Scanner userInput = new Scanner(System.in);
			totalheight = userInput.nextDouble ();
			return x * 12 + y;
		}
		public static double  convertTocentimeters(double x)
		{
			
			Scanner userInput = new Scanner(System.in);
			centimeters = userInput.nextDouble ();
			return x * 2.54;
		}
		public static double convertTometers(double x)
		{
			
			Scanner userInput = new Scanner(System.in);
			meters = userInput.nextDouble ();
			return x/100;
		}
		public static double convertTofeet(double x)
		{
			
			Scanner userInput = new Scanner(System.in);
			inches = userInput.nextDouble ();
			return x / 3.28084;
		}
		public static double convertToTotalinches(double x)
		{
			
			Scanner userInput = new Scanner(System.in);
			feet = userInput.nextDouble ();
			return x * 2.54;
		}
		public static double totalInches(double x, double y)
			{
				
				Scanner userInput = new Scanner(System.in);
				inches = userInput.nextDouble ();
				return x * 12 + y;
			}
	}
		