import java.util.*;
import java.lang.*;
import java.io.*;

class Thread1 extends Thread // thread 1
{
  public void run() // run method overriding
  {
    System.out.println("thread1 starting");
    for(int i=0;i<20;i++)
    {
      if(i%2==0)
      System.out.println(i);
    }
  }
}

class Thread2 extends Thread // thread 2
{
  public void run() // run method overriding
  {
    System.out.println("thread1 starting");
    for(int i=0;i<20;i++)
    {
      if(i%2!=0)
      System.out.println(i);
    }
}
}
public class ThreadNum // main thread
{
  public static void main(String[] args) {
    System.out.println("Main thread starting");
    Thread1 t1=new Thread1();
    Thread2 t2=new Thread2();
    t1.start(); // thread1 started
    try
    {
    // join will let thread1 finish and then only other thread will start
    t1.join();
    }
    catch(InterruptedException e)
    {
      System.out.println("thread interrupted");
    }
    t2.start();
    System.out.println("main thread ending");
  }
}
