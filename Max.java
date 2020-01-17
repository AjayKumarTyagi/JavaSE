public class Max
{
	public static void main(String args[])
	{
	int a,b,c,max;
	a=Integer.parseInt(args[0]);  // converting 1 cmd line argument string into int
	b=Integer.parseInt(args[1]);  // converting 2 cmd line argument string into int
	c=Integer.parseInt(args[2]);  // converting 3 cmd line argument string into int
	if(a>b && a>c)
	{
	max=a;
	}
	else if(b>a && b>c)
	{
	max=b;
	}
	else
	max=c;
	System.out.println("max= "+max);
	}
}
