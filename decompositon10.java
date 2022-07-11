// Java program to convert a decimal
// number to binary number
import java.io.*;

class decompositon10 {
    // function to convert decimal to binary
    static void decompose(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[32];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 10;
            n = n / 10;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);

        System.out.println();

        for (int j = i - 1; j >= 0; j--)
        {
            //System.out.print(binaryNum[j]);
            if(binaryNum[j]>0)
            {
				System.out.print(binaryNum[j]*Math.pow(10,j)+ "+");
			}
		}
		System.out.print("0");
    }

    // driver program
    public static void main(String[] args)
    {
        int n = 456417;
        decompose(n);
        System.out.println();
    }
}

// Contributed by Pramod Kumar