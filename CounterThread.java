class Counter
{
  static int count=0;
  public void increment()
  {
    count++;
    System.out.println("Counter: "+count);
  }
}

class Thread1 implements Runnable
{
  Counter c1=new Counter();
  public void  run()
  {
    c1.increment();
  }
}

public class CounterThread
{
  public static void main(String[] args) {
    for (int i=0;i<10 ;i++ ) {
      Thread t1=new Thread(new Thread1());
      t1.start();
      try
      {
      // join will let thread1 finish and then only other thread will start
      t1.join();
      }
      catch(InterruptedException e)
      {
        System.out.println("thread interrupted");
      }
  }
}
}
