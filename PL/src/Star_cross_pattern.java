import java.util.Scanner;
public class Star_cross_pattern 
{
	public static void main(String str[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an Odd Number:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j || i+j==n+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		s.close();
	}
}
