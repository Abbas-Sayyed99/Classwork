/* 1: WAP  print the total sum of square  from 1 to 10;
  Number   Square


Total            Value  */


class SquareCount
{
	public static void main(String[] args)
	{
     		int n = 1;
		int sum = 0;
		
			System.out.println("\t\t\tNumber   Square");
		
		while(n<=10)
		{
			int sq = n*n;
			System.out.println("\t\t\t"+n+"         "+sq);
			sum = sum+sq;
			
		   n++;
		}
		 	System.out.println("\t\t\tTotal\t"+sum);
	}
}
