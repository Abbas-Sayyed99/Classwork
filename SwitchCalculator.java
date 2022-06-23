import java.util.*;

class SwitchCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t\t\tCalculator");
		System.out.print("\t\t\t==============");

		System.out.print("\n\t\t\t+ : Add");
		System.out.print("\n\t\t\t- : Sub");
		System.out.print("\n\t\t\t* : Mul");
 		System.out.println("\n\t\t\t/ : Div");
		System.out.print("\t\t\tEnter Your Choice : ");
			char S = sc.next().charAt(0);
		System.out.println("\n\t\t\t=================================");
		
		switch(S)
		{
			case '+':
			{
 				System.out.println("\n\t\t\tYou have want to do Addition");
				System.out.print("\t\t\tEnter first number : ");
					int a = sc.nextInt();
 				System.out.print("\t\t\tEnter second number : ");
					int b = sc.nextInt();
				int c = a+b;
				System.out.println("\t\t\tAddition of two number is : " +c);
				break;
			}

			case '-':
			{
				System.out.println("\n\t\t\tYou have want to do Subtraction");
				System.out.print("\t\t\tEnter first number : ");
					int a = sc.nextInt();
 				System.out.print("\t\t\tEnter second number : ");
					int b = sc.nextInt();
				int c = a-b;
				System.out.println("\t\t\tSubtraction of two number is : " +c);		
				break;
			}

			case '*':
			{
				System.out.println("\n\t\t\tYou have want to do Multiplication");
				System.out.print("\t\t\tEnter first number : ");
					float a = sc.nextFloat();
 				System.out.print("\t\t\tEnter second number : ");
					float b = sc.nextFloat();
				float c = a*b;
				System.out.println("\t\t\tMultiplication of two number is : " +c);	
				break;
			}

			case '/':
			{
				System.out.println("\n\t\t\tYou have want to do Division");
				System.out.print("\t\t\tEnter first number : ");
					float a = sc.nextFloat();
 				System.out.print("\t\t\tEnter second number : ");
					float b = sc.nextFloat();
				float c = a/b;
				System.out.println("\t\t\tDivision of two number is : " +c);		
				break;
			}

         		default:
				System.out.println("\n\t\t\tEnter proper choice.");
		}
	}
}