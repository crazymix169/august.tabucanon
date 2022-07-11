// Java program to convert a decimal
// number to binary number
import java.io.*;

class DECtoBIN {
    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[32];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);

        System.out.println();

        for (int j = i - 1; j >= 0; j--)
        {
            //System.out.print(binaryNum[j]);
            if(binaryNum[j]==1)
            {
				System.out.println(Math.pow(2,j));
			}
		}
    }

    // driver program
    public static void main(String[] args)
    {
        int n = 17;
        decToBinary(n);
        System.out.println();
    }
}

// Contributed by Pramod Kumar