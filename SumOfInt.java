public class SumOfInt
{
  public static void main(String[] args) {
    int sum=0;
    for (int i=40;i<=250 ;i++ ) {
      if(i%5==0)
      sum+=i;
    }
    System.out.println("Sum of numbers greater than 40 and less than 250: "+sum);
  }
}
