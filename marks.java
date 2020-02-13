import java.util.*;
public class marks{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int marks[]=new int[10];
    int temp;
    String message="";
    for (int i=0;i<10 ;i++ ) {
      System.out.println("enter "+(i+1)+" student's marks: ");
      marks[i]=scan.nextInt();
    }
    for (int i=0;i<10 ;i++ ) {
      for (int j=i+1;j<10;j++ ) {
        if(marks[i]>marks[j]){
          temp=marks[i];
          marks[i]=marks[j];
          marks[j]=temp;
        }
      }
    }
    System.out.println("Student\t"+"marks\t"+"Result");
    for (int i=0;i<10 ;i++ ) {
      if(marks[i]>40 && marks[i]<=50){
        message="Pass";
      }
      else if (marks[i]>=51 && marks[i]<=75) {
        message="Merit";
      }
      else if (marks[i]>75) {
        message="Distinction";
      }
      else message="Fail";
      System.out.println(i+1+"\t"+marks[i]+"\t"+message);
    }
  }
}
