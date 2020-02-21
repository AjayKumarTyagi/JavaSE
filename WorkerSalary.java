class Worker{
private String name;
private double salary_rate;
Worker(String name, double s_rate)
{
this.name=name;
this.salary_rate=s_rate;
}
public void ComPay()
{
int hours=40;
double salary=hours*this.salary_rate;
System.out.println("name= "+this.name);
System.out.println("rates= "+this.salary_rate);
System.out.println("hours= "+hours);
System.out.println("salary= "+salary);
}
public void ComPay(int days)
{
double salary=days*this.salary_rate;
System.out.println("name= "+this.name);
System.out.println("rates= "+this.salary_rate);
System.out.println("days= "+days);
System.out.println("salary= "+salary);
}
}
class DailyWorker extends Worker{
public DailyWorker(String D_name,double rates)
{
super(D_name,rates);
}
}
class SalariedWorker extends Worker
{
public SalariedWorker(String D_name,double rates)
{
super(D_name,rates);
}
}
