import java.util.Scanner;
public class Prime_number_by_input_limit
{
	public static void main(String str[]) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter lower limit");
		int n=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter upper limit");
		int m=s2.nextInt();
		int i,j;
		int temp=0;
		for(i=n;i<=m;i++)
		{
			for(j=2;j<i;j++)
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