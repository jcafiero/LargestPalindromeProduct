//Project Name: Largest Palindrome Product
//Authors: Jordana Approvato, Jennifer Cafiero & Catherine Javadian
//Pledge: I pledge my honor that I have abided by the Stevens Honor System.
//Date: 1/25/2017


import java.util.*;
import java.math.*;

public class LargestPalindromeProduct
{
	public static int reverseN(int n)
	{
		int backwardsN = 0;
		while (n > 0)
		{
			backwardsN = 10 * backwardsN + n % 10;
			n = n / 10;
		}
		return backwardsN;
	}
	public static boolean isPalindrome(int n)
	{
		if(n == reverseN(n))
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		int result = 0;
		int var1 = 0, var2 = 0;
		long start = System.nanoTime();//takes in System start time of program

        for(int i = 100;i <=999;i++)
        {
            for(int j = 999; j >= i;j--)
            {


				if (isPalindrome(i*j)){
					if (i*j > result)
					{
						result = i * j;
						var1 = i;
						var2 = j;

					}
				}

            }
		}

		System.out.println(var1 + " x " + var2 + " = " + result);
		double elapsed = (System.nanoTime() - start) / 1e6; //line from LargestPrimeFactor in-class assignment to calculate the elapsed time
		System.out.println("Elapsed time: " + elapsed + "ms");//line from LargestPrimeFactor in-class assignment to print out the elapsed time



	}
}