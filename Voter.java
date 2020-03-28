interface Age
{
  int age=18;
  public void EnterAge();
}

class  IsEligible implements Age
{
  public void EnterAge()
  {
    if(this.age<18)
    System.out.println("Not eligible to vote");
    else
    System.out.println("Is eligible to vote");
  }
}

public class Voter
{
  public static void main(String args[])
  {
    IsEligible p1=new IsEligible();
    p1.EnterAge();
  }
}
