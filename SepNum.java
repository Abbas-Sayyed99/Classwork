import java.util.*;
class SepNum
{

         public static void main(String rgs[])
          {
			Scanner sc = new Scanner(System.in);

			System.out.print("\n\t\t\tEnter Number : ");
           		int n = sc.nextInt();

			int i, rem;
			i=n;//initilization

              while(i!=0)
              {
                 rem=i%10;

                    System.out.print("\t\t\t"+rem+" ");
                 i=i/10;
               }
		}
}