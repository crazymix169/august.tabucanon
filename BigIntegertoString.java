// Java program to demonstrate
// toString(radix) method of BigInteger

import java.math.BigInteger;

public class BigIntegertoString {

    public static void main(String[] args)
    {

        // Creating BigInteger object
        BigInteger b1;
        b1 = new BigInteger("32145423456896");

        // create radix
        int radix = 36;

        // apply toString(radix) method
        String b1String = b1.toString(radix);

        // print String
        System.out.println("Binary String of BigInteger "
                           + b1 + " is equal to " + b1String);
    }
}