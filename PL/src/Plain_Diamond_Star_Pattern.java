
public class Plain_Diamond_Star_Pattern 
{
	public static void main(String str[]) 
	{
		for(int i=1;i<=15;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print(" ");
			}
			for(int m=7;m>=i;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("*");
			}
			for(int k=6;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int l=5;l>=i;l--)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=i+1;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=15;i++)
		{
			System.out.print("*");
		}
	}
}
