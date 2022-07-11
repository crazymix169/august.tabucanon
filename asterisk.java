public class asterisk
{
	public static void main(String args[])
	{
		int sc =10;
		int n = sc;
		int r,c,blnk=0;
		char ch='*';
		for(r=1;r<=n;r++)
		{
			for(blnk=n-1; blnk>=r;blnk--)
			{
				System.out.print(" ");
			}
			for(c=1;c<=2*r-1;c++)
			{
				if(r==n || c==1 || c== (2*r-1)) System.out.print(ch);
				else System.out.print(" ");
			}
			System.out.println();
		}

		int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		int arr2[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		  System.out.println("Array Before Bubble Sort");

		  for(int i = 0; i < arr.length; i++)
		  {
			 System.out.print(arr[i] + " ");
		  }
		  System.out.println();
		  bubbleSortLtoG(arr);
		  System.out.println("Array After Bubble Sort");

		  for(int i = 0; i < arr.length; i++)
		  {
			 System.out.print(arr[i] + " ");
		  }
		  System.out.println();
		  bubbleSortGtoL(arr2);
		  System.out.println("Array After Bubble Sort");

		  for(int i = 0; i < arr.length; i++)
		  {
			 System.out.print(arr2[i] + " ");
		  }


		  int n1[]={2,4,6,8,10};

		  int highest=n1[0],lowest=n1[0];

		  int ctr,sum=n1[0];

		  System.out.println();
		  System.out.println("The array is: ");
		  for(int i = 0; i < n1.length; i++)
		  {
			 System.out.print(n1[i] + " ");
		  }

		  for(ctr=1;ctr<n1.length;ctr++)
		  {
			  if(n1[ctr]>highest)
			  {
				  highest=n1[ctr];
			  }
			  if(n1[ctr]<lowest)
			  {
				  lowest=n1[ctr];
			  }
			  sum+=n1[ctr];
		  }
		  System.out.println();
		  System.out.println("Highest: "+highest);
		  System.out.println("Lowest: "+lowest);
		  System.out.println("Sum: "+sum);
		  System.out.println();

		  double m1=2,n2=4;

		  System.out.println("First Number is: "+m1);
		  System.out.println("Second Number is: "+n2);
		  System.out.println("Sum: "+(m1+n2));
		  System.out.println("Difference: "+(m1-n2));
		  System.out.println("Product: "+(m1*n2));
		  System.out.println("Quotient: "+(m1/n2));

		  int x1=1,y1=40,z1=0;

		  for(x1=1;x1<=y1;x1++)
		  {
			  System.out.print(x1+" ");
			  for(z1=1;z1<=x1;z1++)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
		  }




   }


	static void bubbleSortLtoG(int[] arr)
	{
	      int n = arr.length;
	      int temp = 0;

	      for(int i = 0; i < n; i++)
	      {
	         for(int j=1; j < (n-i); j++)
	         {
	            if(arr[j-1] > arr[j])
	            {
	               temp = arr[j-1];
	               arr[j-1] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
    }

    static void bubbleSortGtoL(int[] arr)
	{
		  int n = arr.length;
		  int temp = 0;

		  for(int i = 0; i < n; i++)
		  {
			 for(int j=1; j < (n-i); j++)
			 {
				if(arr[j-1] < arr[j])
				{
				   temp = arr[j-1];
				   arr[j-1] = arr[j];
				   arr[j] = temp;
				}
			 }
		  }
    }
}