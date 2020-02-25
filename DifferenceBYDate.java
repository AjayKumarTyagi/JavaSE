class Date
{
  int date;
  int month;
  int year;
/*  {
    date=1;
    month=1;
    year=2001;
  }*/
  public void EnterDate(int date,int month,int year)
  {
    this.date=date;
    this.month=month;
    this.year=year;
  }
}

class AnotherDate extends Date
{
  private int ResultDate;
  private int ResultMonth;
  private int ResultYear;
/*  AnotherDate()
  {
    super();
  }*/
  public void DifferenceDate(int date1,int month1,int year1)
  {
    if(this.date<date1)
    {
      this.date+=30;
      this.month--;
    }
    ResultDate=this.date-date1;
    if(this.month<month1)
    {
      this.month+=12;
      this.year--;
    }
    ResultMonth=this.month-month1;
    /*if(this.year<year1)
    {

    }*/
    ResultYear=this.year-year1;
    System.out.println("Date: "+ResultDate+" Month: "+ResultMonth+" Year: "+ResultYear );
  }
}

public class DifferenceBYDate
{
  public static void main(String args[])
  {
    AnotherDate d1=new AnotherDate();
    //AnotherDate d2=new AnotherDate();
    d1.EnterDate(24,2,2020);
    d1.DifferenceDate(2,9,2000);
  }
}
