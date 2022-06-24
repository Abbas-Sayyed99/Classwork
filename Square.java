/* 2: WAP print Square of each number from 1 to 20:
     Number       Square
      4             16 */


class Square
{
	public static void main(String[] args)
	{
     		int n = 1;
		
		System.out.println("\t\t\tNumber   Square");
		
		while(n<=20)
		{
			int s = n*n;
			System.out.println("\t\t\t"+n+"         "+s);
			
		   n++;
		}
	}
}
