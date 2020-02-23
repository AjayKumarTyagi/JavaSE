abstract class Call
{
  double duration;
  double charges;
  abstract void cost();
}

class OridinaryCall extends Call
{
  OridinaryCall(double duration)
  {
    super();
    this.duration=duration;
  }
  public void cost()
  {
    this.charges=this.duration*1.2;
    System.out.println("Total cost: "+this.charges);
  }
}

class UrgentCall extends Call
{
  UrgentCall(double duration)
  {
    super();
    this.duration=duration;
  }
  public void cost()
  {
    this.charges=this.duration*1.5;
    System.out.println("Total cost: "+this.charges);
  }
}

class LightningCall extends Call
{
  LightningCall(double duration)
  {
    this.duration=duration;
  }
  public void cost()
  {
    this.charges=this.duration*2.0;
    System.out.println("Total cost: "+this.charges);
  }
}

class TrunkCall
{
  public static void main(String args[])
  {
    OridinaryCall call1 =new OridinaryCall(3.40);
    UrgentCall call2=new UrgentCall(1.30);
    LightningCall call3=new LightningCall(0.30);

    call1.cost();
    call2.cost();
    call3.cost();
  }
}
