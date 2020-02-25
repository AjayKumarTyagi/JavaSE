interface Age
{
  String message="Is eligible to vote";
  public void EnterAge(int age);
}

class  IsEligible implements Age
{
  public void EnterAge(int age)
  {
    if(age<18)
    System.out.println("Not eligible to vote");
    else
    System.out.println(message);
  }
}

public class Voter
{
  public static void main(String args[])
  {
    IsEligible p1=new IsEligible();
    p1.EnterAge(19);
  }
}
