
public class Star_equilateral_traingle 
{

	public static void main(String str[]) 
	{
		System.out.println("Star Equilateral Traingle Pattern");
		System.out.println();
		
		for(int i=1;i<6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
