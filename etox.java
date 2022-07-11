
public class etox
{
	public static void main(String[] args)
	{
		int n=100;
		double x=2;
		System.out.println(exp69(n,x));
	}

	public static double exp69(int n, double x)
	{
		double sum=1;
		double x=2;

		for(int i=n-1; i>0;i--)
		{
			sum=1+x*sum/i;
		}

		return sum;
	}
}