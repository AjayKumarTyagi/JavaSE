import java.util.*;
public class Months
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number corresponding to a month: ");
    String month="";
    int num=scan.nextInt();
    if(num<1 || num>12)
    {
      System.out.println("invalid input");
      System.exit(0);
    }
    switch(num)
    {
      case 1:
      month="January";
      break;
      case 2:
      month="Feburary";
      break;
      case 3:
      month="March";
      break;
      case 4:
      month="April";
      break;
      case 5:
      month="may";
      break;
      case 6:
      month="june";
      break;
      case 7:
      month="july";
      break;
      case 8:
      month="August";
      break;
      case 9:
      month="September";
      break;
      case 10:
      month="October";
      break;
      case 11:
      month="november";
      break;
      case 12:
      month="december";
      break;
    }
    System.out.println("month: "+month);
  }
}
