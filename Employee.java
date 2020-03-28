class Employees
{
  String name;
  int empid;
  double salary;
  Employees(String name,int empid,double salary)
  {
    this.name=name;
    this.empid=empid;
    this.salary=salary;
  }
  public String DisplayName()
  {
    return this.name;
  }
  public double DisplaySalary()
  {
    return this.salary;
  }
  public void IncreaseSalary(double percent)
  {
    this.salary+=(percent/100);
    System.out.println("Increased salary= "+this.salary);
  }
}

class Manager extends Employees
{
  String department;
  Manager(String name,int empid,double salary,String department)
  {
    super(name,empid,salary);
    this.department=department;
    System.out.println("Manager: ");
    System.out.println("Name: "+this.name+" Id: "+this.empid+" Salary: "+this.salary);
  }
}

public class Employee
{
  public static void main(String[] args) {
    Employees e1=new Employees("Ajay",121,10000);
    Manager m1=new Manager("Bosco",564,8750472,"pug");
    String name=e1.DisplayName();
    Double sal=e1.DisplaySalary();
    System.out.println("name: "+name+" salary: "+sal);
    e1.IncreaseSalary(10);
  }
}
