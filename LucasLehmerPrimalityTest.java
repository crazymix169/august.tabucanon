import java.math.BigInteger;
import java.util.Scanner;

// Java program to compute n-th Fibonacci
// number where n may be large.
import java.io.*;
import java.util.*;
import java.math.*;


public class LucasLehmerPrimalityTest
{
	public static void main(String[] args) throws InterruptedException
	{
		int n=100,p=13;
		double x=1;

		//System.out.println(LucasLehmerTest69(p));

		System.out.println(LucasLehmerTest69v(p));
		//BigDecimal bigFromFloat = new BigDecimal(dWithFloat);
		//double dJustParsed=LucasLehmerTest69(p);
		//BigDecimal bigJustParsed = new BigDecimal(dJustParsed);
  		//System.out.println(bigFromFloat);

		//System.out.println(LucasLehmerTest69(p));
		//System.out.println(LucasLehmerTest691(p));
		//System.out.println(IsPrime(31));
		//Factors(p);
		int N = 100;
        System.out.println(factorial(N));
        System.out.println(powz(N));
        System.out.println(powz2(N));
        System.out.println();

		N=21000000;

        System.out.println();

	    //powz3(N);

	    System.out.println(sumOfFifthPowers());

	    //fourSquareTheorem();

	    int a = 169;
		    // 74 = 0*0 + 0*0 + 5*5 + 7*7
		    // 74 = 0*0 + 1*1 + 3*3 + 8*8
		    // 74 = 0*0 + 3*3 + 4*4 + 7*7
		    // 74 = 1*1 + 1*1 + 6*6 + 6*6
		    // 74 = 2*2 + 3*3 + 5*5 + 6*6

		System.out.println();
    	printFourSquares(a);

    	double u,v=-(31/467),w=0,aa,bb,cc;
    	w=Math.sqrt(22030+28949*v-56158*v*v+36941*v*v*v-31790*v*v*v*v);

		aa=85*v*v+484*v-313;
		bb=68*v*v-586*v+10;
		cc=0;

    	System.out.println("rtt: "+bb);




	}
	/*
	In 1986, Noam Elkies found a method to construct an infinite series of counterexamples for the k = 4 case.[5] His smallest counterexample was

	26824404 + 153656394 + 187967604 = 206156734.
	A particular case of Elkies' solutions can be reduced to the identity[6][7]

	(85v^2 + 484v - 313)^4 + (68v^2 - 586v + 10)^4 + (2u)^4 = (357v^2 - 204v + 363)^4
	where

	u^2 = 22030 + 28849v - 56158v^2 + 36941v^3 - 31790v^4.
	This is an elliptic curve with a rational point at v1 = -31/467
	. From this initial rational point, one can compute an infinite collection of others. Substituting v1 into the identity and removing common factors gives the numerical example cited above.

	In 1988, Roger Frye found the smallest possible counterexample

	958004 + 2175194 + 4145604 = 4224814
for k = 4 by a direct computer search using techniques suggested by Elkies. This solution is the only one with values of the variables below 1,000,000.[8]
	*/

	static void printFourSquares(int a)
	{
	    int v=0;
	    // loops checking the sum of squares
	    for (int i = 0; i * i <= a; i++)
	    {
	        for (int j = i; j * j <= a; j++)
	        {
	            for (int k = j; k * k <= a; k++)
	            {
	                for (int l = k; l * l <= a; l++)
	                {

	                    // if sum of four squares equals
	                    // the given no.
	                    if (i * i + j * j + k * k + l * l == a)
	                    {
							v++;
	                        // printing the numbers
	                        System.out.print( a + " = " + i + "*" + i
	                                        + " + " + j + "*" + j + " + ");
	                        System.out.println( k + "*" + k + " + "
	                                           + l + "*" + l+" :the total versions of this number are: "+v);
	                    }
	                }
	            }
	        }
	    }
	}

	static void fourSquareTheorem() throws InterruptedException
	{
		double a,b,c,d,e,sum;

		for(a=0;a<=100;a++)
		{
			for(b=0;b<=100;b++)
			{
				for(c=0;c<=100;c++)
				{
					for(d=0;d<=100;d++)
					{
						for(e=0;e<=100;e++)
						{
							sum=Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)+Math.pow(d,2);

							if(e==sum)
							{
								System.out.println("The number e " +e+" is the sum of the squares: "+a+" + "+b+" + "+c+" + "+d);
								Thread.sleep(500);
							}
						}

					}

				}

			}

		}
	}

	static double sumOfFifthPowers()
	{

		int result = 0;

		for (int i = 2; i < 355000; i++)
		{
			int sumOfPowers = 0; int number = i;
			while (number > 0)
			{
				int d = number % 10;
				number /= 10;

				int temp = d;
				for(int j = 1; j < 5; j++)
				{
					temp *= d;
				}
				sumOfPowers += temp;
			}

			if (sumOfPowers == i) {
				result += i;
			}
		}

		return result;
	}

	// Returns Factorial of N
	static BigInteger factorial(int N)
	{
		// Initialize result
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

		// Multiply f with 2, 3, ...N
		for (int i = 2; i <= N; i++)
			f = f.multiply(BigInteger.valueOf(i));

		return f;
    }

    // Returns Factorial of N
	static BigInteger powz(int N)
	{
		// Initialize result
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

		// Multiply f with 2, 3, ...N
		for (int i = 1; i <= N; i++)
			f = f.multiply(BigInteger.valueOf(2));



		return f;
    }

    // Returns Factorial of N
	static BigInteger powz2(int N)
	{
		// Initialize result
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

		// Multiply f with 2, 3, ...N
		for (int i = 1; i <= N; i++)
		{
			f=BigInteger.valueOf(1);
			f = f.multiply(BigInteger.valueOf(i));
			f = f.multiply(BigInteger.valueOf(i));
			f = f.multiply(BigInteger.valueOf(i));
			f = f.multiply(BigInteger.valueOf(i));
			//System.out.println(f);

		}


		return f;
    }

    // Returns Factorial of N
	static void powz3(int N)
	{
		// Initialize result
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
		BigInteger g = new BigInteger("1");
		BigInteger h = new BigInteger("1");
		BigInteger i = new BigInteger("1");
		BigInteger j = new BigInteger("0");

		int fff=20;

		// Multiply f with 2, 3, ...N
		for (int a = 1; a <= N; a++)
		{
			for(int b=1;b<=N;b++)
			{

				for(int c=1;c<=N;c++)
				{

					for(int d=1;d<=N;d++)
					{
						f=BigInteger.valueOf(1);
						f = f.multiply(BigInteger.valueOf(a));
						f = f.multiply(BigInteger.valueOf(a));
						f = f.multiply(BigInteger.valueOf(a));
						f = f.multiply(BigInteger.valueOf(a));

						g=BigInteger.valueOf(1);
						g = g.multiply(BigInteger.valueOf(b));
						g = g.multiply(BigInteger.valueOf(b));
						g = g.multiply(BigInteger.valueOf(b));
						g = g.multiply(BigInteger.valueOf(b));

						h=BigInteger.valueOf(1);
						h = h.multiply(BigInteger.valueOf(c));
						h = h.multiply(BigInteger.valueOf(c));
						h = h.multiply(BigInteger.valueOf(c));
						h = h.multiply(BigInteger.valueOf(c));

						i=BigInteger.valueOf(1);
						i = i.multiply(BigInteger.valueOf(d));
						i = i.multiply(BigInteger.valueOf(d));
						i = i.multiply(BigInteger.valueOf(d));
						i = i.multiply(BigInteger.valueOf(d));

						j=BigInteger.valueOf(0);

						j=f.add(f);
						j=f.add(g);
						j=f.add(h);

						if(j.equals(i))
						{
							System.out.println("Value of f:"+f+"\nValue of g:"+g+"\nValue of h:"+h+"\nValue of i:"+i);
						}

					}


			    }


			}

		}


		//return f;
    }

    // Returns Factorial of N
	static BigInteger LucasLehmerTest69v(int p)
	{
		// Initialize result
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

		// Multiply f with 2, 3, ...N
		for (int i = 1; i <= p; i++)
			f = f.multiply(BigInteger.valueOf(2));



		BigInteger s=new BigInteger("4");
		BigInteger s1=new BigInteger("0");
		BigInteger M=f.subtract(BigInteger.valueOf(1));

		for(int x=1;x<=p-2;x++)
		{
			s=s.multiply(s);
			s=s.subtract(BigInteger.valueOf(2));
			s=s.remainder(M);
			System.out.println("x: "+x+" :"+s);
		}

		if(s.equals(s1))
			System.out.println("prime");
		else
			System.out.println("composite");

		return s;
    }

	public static String LucasLehmerTest69(int p)
	{
		double s=4;
		double M=Math.pow(2,p)-1;

		//double M=11;
		String dd="";
		//BigDecimal bigJustParsed = new BigDecimal(M);

		for(int x=1;x<=p-2;x++)
		{
			s=((s*s)-2)%M;

			System.out.println("x: "+x+" :"+s);
		}

		if(s==0)
			dd="prime";
		else
			dd="composite";

		return dd;
	}

	public static String LucasLehmerTest691(int p)
	{
		long s=4;
		long M=(long)Math.pow(2,p)-1;
		String dd="";

		for(int x=1;x<=p-2;x++)
		{
			s=((s*s)-2)%M;
			System.out.println("x: "+x+" :"+s);
		}

		if(s==0)
			dd="prime";
		else
			dd="composite";

		return dd;
	}



	public static String IsPrime(double p)
	{
		String xx="Prime";
		double v=(Math.pow(2,p)-1);

		for(double x=2; x<v/2;x++)
		{
			if(v%x==0)
			{
				xx="Composite";
				System.out.println(v%x);
				break;
			}
		}

		return xx;
	}

	public static void Factors(double p)
	{
		String xx="Prime";
		double v=(Math.pow(2,p)-1);
		double num=v;

		for(double x=2; x<v/2;x++)
		{
			if(v%x==0)
			{
				v=v/x;
				System.out.println(x);
				//break;
			}
		}


	}


}