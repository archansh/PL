
public class  Plus_Star_Pattern
{
	public static void main(String str[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3 || j==5)
				{
					System.out.print("X ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
