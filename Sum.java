//2: find the sum of a number 34567834;

import java.util.*;
class Sum
{

         public static void main(String rgs[])
          {

           	long n = 34567834;
			long i, rem, sum = 0L;
			i=n;//initilization

              while(i!=0)
              {
                 rem=i%10;
			   sum = sum+rem;
                 i=i/10;
               }
				System.out.print("\t\t\tSum of number is : "+sum);
		}
}