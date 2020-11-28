import java.util.Scanner;
public class Star_Pattern1
{
	public static void main(String str[]) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
