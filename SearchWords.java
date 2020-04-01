import java.util.*;
import java.lang.*;
import java.io.*;

class Thread1 extends Thread // thread 1
{
  public void run() // run method overriding
  {
    System.out.println("thread1 starting");
    Scanner scan=new Scanner(System.in);
    String s="";
    String word="";
    System.out.println("enter word to be searched: ");
    word=scan.nextLine();
    // this try block will automatically close the file
    try(BufferedReader f1=new BufferedReader(new FileReader("document1.txt")))
    {
      while((s=f1.readLine())!=null)
      {
        if(s.indexOf(word)==-1)
        {
          System.out.println("word not found");
        }
          else
          System.out.println(word+" found!!");
      }
    }
    catch(IOException e) // Exception caught
    {
      System.out.println("I/O error "+e);
    }
    System.out.println("thread1 ending");
  }
}

class Thread2 extends Thread // thread 2
{
  public void run() // run method overriding
  {
    System.out.println("thread2 starting");
    Scanner scan=new Scanner(System.in);
    String s="";
    int count;
    HashMap<String,Integer> map=new HashMap<>(); // hashmap
    // this try block will automatically close the file
    try(BufferedReader f1=new BufferedReader(new FileReader("document2.txt")))
    {
      while((s=f1.readLine())!=null)
      {
        String word[]= s.split(" ");
        for(int i=0;i<word.length;i++)
        {
          //will check if key is already there in map
          if(map.containsKey(word[i]))
          {
            count=map.get(word[i]);
            map.put(word[i],count+1);
          }
          else{
            map.put(word[i],1);
          }
        }
      }
    }
    catch(IOException e) // exception caught
    {
      System.out.println("I/O error "+e);
    }
    System.out.println(map);
    System.out.println("thread2 ending");
  }
}
public class SearchWords // main thread
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
