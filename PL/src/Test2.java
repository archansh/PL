
public class Test2 
{
	public static void main(String str[]) 
	{
		char[][] pic=new char[6][6];
		for(int i=0;i<6;i++)
		{
			for(int j=0;i<6;j++)
			{
				if(i==j || i==0 || i==5)
					pic[i][j]='*';
					//System.out.print('*');
				else
					pic[i][j]='a';
					//System.out.print('a');
			}
			System.out.println();
		}
		for(int i=0;i<6;i++)
		{
			for(int j=0;i<6;j++)
			{
				System.out.print(pic[i][j]);
			}
			System.out.println();
		}
	}
}
