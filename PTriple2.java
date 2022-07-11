// Java program to generate pythagorean
// triplets smaller than a given limit
import java.io.*;
import java.util.*;

class PTriple2 {

    // Function to generate pythagorean
    // triplets smaller than limit
    static void pythagoreanTriplets()
    {

        // triplet: a^2 + b^2 = c^2
        int a, b, c = 0,pt=0;

        // loop from 2 to max_limitit
        int m = 2;

        // Limiting c would limit
        // all a, b and c
        for (int x = 2; x <= 25; ++x)
        {

            // now loop on j from 1 to i-1
            for (int y = 1; y < x; ++y)
            {

				a=x*x-y*y;
				b=2*x*y;
				c=x*x+y*y;

				if(a>500||b>500||c>500)
                	break;


				if(gcdIterativeMethod1(x,y)==1)
                	System.out.println("The pythagorean triple number "+(++pt)+" with x= "+x+" and y= "+y+" is: " +a + " && " + b + "--> " + c);


            }

        }
    }

    private static int gcdIterativeMethod1(int a, int b)
    {
			int temp = 0;
			while (b != 0) {
				temp = b;
				b = a % b;
				a = temp;
			}
			return a;
	}

    // Driver Code
    public static void main(String args[])
    {
        int limit = 500;
        pythagoreanTriplets();
    }
}

// This code is contributed by Manish.