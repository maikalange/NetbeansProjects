/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atomicexample;

/**
 *
 * @author MARCUS
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.Iterator;
 
public class CounterTest {
 
   public static void main(String[] args) throws InterruptedException {
 
      final Counter counter = new Counter();
 
      // create 1000 threads
      ArrayList<MyThread> threads = new ArrayList<MyThread>();
      for (int x = 0; x < 1000; x++) {
         threads.add(new MyThread(counter));
      }
 
      // start all of the threads
      Iterator i1 = threads.iterator();
      while (i1.hasNext()) {
         MyThread mt = (MyThread) i1.next();
         mt.start();
      }
 
      // wait for all the threads to finish
      Iterator i2 = threads.iterator();
      while (i2.hasNext()) {
         MyThread mt = (MyThread) i2.next();
         mt.join();
      }
 
      System.out.println("Count: " + counter.getCount());
  }
}
 
// thread that increments the counter 100000 times.
class MyThread extends Thread {
   Counter counter;
 
   MyThread(Counter counter){
      this.counter = counter;
   }
   public void run() {
      for (int x = 0; x < 100000; x++) {
         counter.incrementCount();
      }
   }
}
 
// class that uses AtomicInteger for counter
class Counter {
 
   private AtomicInteger count = new AtomicInteger(0);
 
   public void incrementCount() {
      count.incrementAndGet();
   }
 
   public int getCount() {
     return count.get();
   }
}