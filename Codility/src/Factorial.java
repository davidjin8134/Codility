/*
A positive integer N is given. Write a function:
           function solution(N)；
that returns the sum of the values of the digits in a decimal representation of N! (fractorial of N).
For example, give N = 14, the function should return 45, because N! = 87178291200 and the sum of the values of its digits equals:
8+7+1+7+8+2+9+1+2+0+0 = 45
The function should return -1 if the result exceeds 100,000,000.
Assume that：
N is an integer within the range [1...2,000]


Complexity:
expected worst-case time complexity is O(N^2)
expected worst-case space complexity is O(N)
 */

import  java.math.*;

public class Factorial {
	
	void solution(int number)
	{   
		
		BigInteger factorial = 1;
		for (int i = 1; i <= number ; i++) {
			   result = result * i;
			}
		
		
	}

}
