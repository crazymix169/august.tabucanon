public class pi
{
	public static void main(String[] args)
	{
		int n=100;


		double interval=0.00000001,area=0,x,y;

		    for (x=0; x<1; x+=interval)
		        area+=4*interval*Math.sqrt(1-x*x);

    	System.out.println("pi: "+area);

		//System.out.println(exp69(n,x));
	}

	public static double exp69(int n, double x)
	{
		double sum=1;

		for(int i=n-1; i>0;i--)
		{
			sum=1+x*sum/i;
		}

		return sum;
	}
}