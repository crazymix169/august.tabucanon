
public class decomposition2
{
	public static void main(String args[])
	{
		double x = 0,i=0;
		double value = 65;
		for (i=0; (value - Math.pow(2, i)) >= 0; i++)
		{
		    value = value - Math.pow(2, i);
		    x++;
		}
		System.out.println(value);
		for (i=0; i<x; i++)
		{
		    System.out.println("addent: " + Math.pow(2, i));
		}
	}
}