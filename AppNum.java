import java.math.*;
public class AppNum
{
  int num=25;
  public boolean isTriangular()
  {
    int i,sum=0;
    for (i=0;sum<num ;i++ )
    {
      sum=sum+i;
      System.out.println(sum);
    }
    System.out.println("\n"+i);
    if(sum==num)
    return true;
    else
    return false;
  }
  public boolean isSquare()
  {
    double sqroot=Math.sqrt(num);
    if(sqroot==Math.floor(sqroot))
    return true;
    else
    return false;
  }
  public static void main(String[] args) {
    AppNum n=new AppNum();
    System.out.println(n.isSquare());
  }
}
