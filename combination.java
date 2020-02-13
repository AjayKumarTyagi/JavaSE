import java.util.*;
public class combination{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num[]=new int[3];
    int sum=0;
    System.out.println("enter 3 number 0-9: ");
    for (int i=0;i<3 ;i++ ) {
      System.out.println((i+1)+" number: ");
      num[i]=scan.nextInt();
      sum+=num[i];
    }
    System.out.println("possible combinations: ");
    for (int i=0;i<3 ;i++ ) {
      for (int j=0;j<3 ;j++ ) {
        if(num[i]!=num[j]){
          System.out.println(num[i]+""+num[j]+""+(sum-(num[i]+num[j])));
        }
      }
    }
  }
}
