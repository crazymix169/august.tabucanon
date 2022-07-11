 class Swap2Values{
    public static void main(String[] args){
       int a = 20, b = 10;

       //before swaping
       System.out.print("Before Swapping the values of a and b are: a = "+a+", b = "+b);

       //swapping
       a = a + b;
       b = a - b;
       a = a - b;

       //after swapping
      System.out.print("\nAfter Swapping the values of a and b are: a = "+a+", b = "+b);
      System.out.println();
    }
  }