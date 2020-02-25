import java.util.*;
public class SquareAndSum
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int sum=0;
    System.out.println("enter numbers in array: ");
    for (int i=0;i<10 ;i++ ) {
      System.out.println((i+1)+" element: ");
      num[i]=scan.nextInt();
    }
    for (int i=0;i<10 ;i++ ) {
      System.out.println((i+1)+" element: "+num[i]+" square: "+(num[i]*num[i]));
      sum+=(num[i]*num[i]);
  }
  System.out.println("sum of squares: "+sum);
}
}
