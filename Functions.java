interface MathsFunctions
{
  public double division(double num,double den);
  public int  modulus(int num,int den);
}

class ImplementFunctions implements MathsFunctions
{
  public double division(double num,double den)
  {
    return num/den;
  }
  public int  modulus(int num,int den)
  {
    return num%den;
  }
}

public class Functions
{
  public static void main(String[] args) {
    ImplementFunctions fun1=new ImplementFunctions();
    double div=fun1.division(56.34,24.97);
    int mod=fun1.modulus(56,24);
    System.out.println("division: "+div+" modulus: "+mod);
  }
}
