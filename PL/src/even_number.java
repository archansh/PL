import java.util.Scanner;
public class even_number {

	public static void main(String src[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		s.close();
	}

}
