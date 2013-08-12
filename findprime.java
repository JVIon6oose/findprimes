package findprime;

import java.util.Scanner;

public class findprime
{
	
	//Main function, takes in upper bound for finding primes from keyboard.
	public static void main(String[] args)
	{
		try 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an upper bound");
		
		
			int bounds = scan.nextInt();
			int current = 2;
			
			//Positive integers only
			if(bounds < 1)
			{
				System.out.println("Incorrect entry...");
				System.exit(0);
			}
			
			//Composite number 1 and prime number 2 are special - so it is just coded.
			System.out.println("1 is not prime.");
		
			if(bounds == 2)
			{
				System.out.println("2 is prime.");
			}
			
			while(current < bounds)
			{
				
				primecheck(current);
				current = displaycount(current);
				
			}
			
						
		} catch (NumberFormatException nfe)
		
		{
			System.out.println("Incorrect entry...");
			System.exit(0);
			
		}
		
				
		
	}
	
	//Counts by 1, 3, 7, and 9 and displays the composite even numbers and those divisible by 5.
	public static int displaycount(int current_par)
	{
		String parsed = Integer.toString(current_par);
		int length = parsed.length() - 1;
		
		if((parsed.charAt(length) == '1') || (parsed.charAt(length) == '5') || (parsed.charAt(length) == '7') || (parsed.charAt(length) == '9'))
		{
			System.out.println((current_par + 1) + " is not prime.");
			current_par = current_par + 2;
		}
		else if(parsed.charAt(length) == '3')
		{
			System.out.println((current_par + 1) + " is not prime.");
			
			if(current_par == 3)
			{
				System.out.println("5 is prime.");
			}
			
			else
			{
				System.out.println((current_par + 2) + " is not prime.");
			}
			
			System.out.println((current_par + 3) + " is not prime.");
			current_par = current_par + 4;
		}
		else
		{
			current_par = current_par + 1;
		}
		return current_par;
		
	}
	//Only counts by 1, 3, 7, and 9.
	public static int count(int test_par)
	{
		String parsed = Integer.toString(test_par);
		int length = parsed.length() - 1;
		
		if((parsed.charAt(length) == '1') || (parsed.charAt(length) == '5') || (parsed.charAt(length) == '7') || (parsed.charAt(length) == '9'))
		{
			test_par = test_par + 2;
		}
		else if(parsed.charAt(length) == '3')
		{
			test_par = test_par + 4;
		}
		else
		{
			test_par = test_par + 1;
		}
		return test_par;
	}
	
	//Tests the number it is given whether it is prime by dividing it with other numbers which may be prime, or those
	//that end in 1, 3, 7, or 9.
	public static void primecheck(int test)
	{
		boolean chk = true;
		
		if(test == 2)
		{
			System.out.println("2 is prime.");
		}
		
		else
		{
			int i = 2;

						
			while(i < test)
			{
				
				if(test%i == 0)
				{
					System.out.println(test + " is not prime.");
					chk = false;
					i = test + 1;
				}
				
				i = count(i);							
			
			}
		
			if(chk == true)
			{
				System.out.println(test + " is prime.");
			}

		}
	}
}

