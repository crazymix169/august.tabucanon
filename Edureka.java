import java.util.Scanner;
public class Edureka
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        for (int i= 1; i<= rows ; i++)
        {
            for (int j=i; j <rows ;j++)
			{
					System.out.print(" ");
			}
			int k;
			for (k=1; k<=i;k++)
			{
				System.out.print("*");
			}

			System.out.print(" "+ Integer.toString(k-1));

			System.out.println("");
		}

		for (int i=rows; i>=1; i--)
		{
			for(int j=i; j<=rows;j++)
			{
				System.out.print(" ");
			}

			int k;
            for(k=1; k<i ;k++)
            {
                System.out.print("*");
            }

			if(i>=2)
			System.out.print(" "+ Integer.toString(k-1));

            System.out.println("");

        }
        sc.close();
    }
}