import java.math.BigInteger;

public class DigitalRoot
{
	/*
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
	*/

	static BigInteger Mdigroot2(BigInteger n) throws InterruptedException
	{
		BigInteger root = new BigInteger("1");



		// Loop to do sum while
		// sum is not less than
		// or equal to 9
		while(true)
		{
			root=BigInteger.valueOf(1);
			BigInteger xx=n;
			BigInteger xx2=n;
			while (n.compareTo(BigInteger.valueOf(0))!=0)
			{





				root=root.multiply(n.mod(BigInteger.valueOf(10)));

				//root *= n % 10;
				//n /= 10;
				//System.out.println(root);
				n=n.divide(BigInteger.valueOf(10));
				//System.out.println("n: "+n+" xx2: "+xx2+" root: "+root);
				//n=xx2;

				//


			}
			//Thread.sleep(11000);

			System.out.println("root: "+root);
			if(root.compareTo(BigInteger.valueOf(10))<0)
				break;
			n=n.add(root);
		}



		return root;
	}


	static long digroot(long n)
	{
		long root = 0;

		// Loop to do sum while
		// sum is not less than
		// or equal to 9
		while (n > 0 || root > 9)
		{
			 if (n == 0) {
				n = root;
				root = 0;
			}

			root += n % 10;
			n /= 10;
		}
		return root;
	}

	static long Mdigroot(long n)
	{
		long root = 1;

		// Loop to do sum while
		// sum is not less than
		// or equal to 9
		while(true)
		{
			root=1;
			while (n!=0)
			{


				root *= n % 10;
				n /= 10;
				//System.out.println(root);


			}
			n=root;
			if(root<10)
				break;
		}
		return root;
	}



	// Driver code
	public static void main(String argc[]) throws InterruptedException
	{
		long n = 1135L;
		System.out.println(digroot(n));
		System.out.println(Mdigroot(n)+"\n");

		BigInteger root = new BigInteger("277777788888899");

		System.out.println("original number: "+root);
		System.out.println(Mdigroot2(root));


    }


}