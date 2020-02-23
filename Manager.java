class Employee
{
  String name;
  int empid;
  double salary;
  Employee(String name,int empid.double salary)
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
