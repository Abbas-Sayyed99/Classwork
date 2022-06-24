// 1: WAP print all numbers which are divisible by 11 from  22 to 400;


class Divisible
{
	public static void main(String[] args)
	{
     		int n = 22;
		
		while(n<=400)
		{
			if(n%11==0)
			System.out.print(n+ " ");
			
		   n++;
		}
	}
}
