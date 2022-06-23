import java.util.*;

class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t\t\tVowel Or Consonant");
		System.out.println("\t\t\t======================");

		System.out.print("\n\t\t\tEnter Character : ");
			char V = sc.next().charAt(0);
		System.out.println("\n\t\t\t=================================");
		
		switch(V)
		{
			case 'a':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}

			case 'A':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}


			case 'e':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}


			case 'E':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}

 			case 'i':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}
			
			case 'I':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}

   			case 'o':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}

                	case 'O':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}

                	case 'u':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}    
			

               		 case 'U':
			{
				System.out.println("\t\t\tIt is vowel");
				break;
			}
         		default:
				System.out.println("\n\t\t\tIt is Consonant.");
		}
	}
}
