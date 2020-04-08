class Thread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread started: "+Thread.currentThread().getName());
		System.out.println("Threading complete: "+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
	}
}
public class ThreadsPriority {

	public static void main(String[] args) throws InterruptedException {
		Thread t0=new Thread(new Thread1());
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread1());
		Thread t3=new Thread(new Thread1());
		Thread t4=new Thread(new Thread1());
	t0.start();
	t0.setPriority(5);
	t1.start();
	t1.setPriority(10);
  try
  {
    t1.sleep(2000);
  }
  catch(InterruptedException e)
  {
    System.out.println("Error");
  }
	t2.start();
	t2.setPriority(2);
	t3.start();
	t3.setPriority(3);
	t4.start();
	t4.setPriority(8);
  try
  {
    t4.sleep(2000);
  }
  catch(InterruptedException e)
  {
    System.out.println("Error");
  }
	}

}
