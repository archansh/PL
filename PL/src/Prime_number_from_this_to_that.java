
public class Prime_number_from_this_to_that 
{

	public static void main(String str[])
	{
		int temp=0;
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			
			}
		}
	}

}
