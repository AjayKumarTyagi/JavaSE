public class Fibo
{
public static void main(String args[])
{
int f1,f2,f3,i;
f1=0;
f2=1;
System.out.println(f1);
System.out.println(f2);
for(i=0;i<10;i++)
{
f3=f1+f2;
System.out.println(f3);
f1=f2;
f2=f3;
}
}
}
