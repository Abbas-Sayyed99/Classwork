/* 3: WAP input a number and print the Table of it.
      2  x 1= 2
      2  x  2 = 2 */

import java.util.*;
class Table
{
	public static void main(String[] args)
	{
     		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t\t\tEnter any number for multiplication : ");
			int n = sc.nextInt();
		int m = 1;

		while(m<=10)
		{	
			int t = n*m;
			System.out.println("\t\t\t" +n+ "*" +m+ "=" +t);
			
		   m++;
		}
	}
}
