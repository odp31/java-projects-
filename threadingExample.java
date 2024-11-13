public class MultiThreadingExample
  {
    public static void main(String[] args)
    // create two threads
    {
      Thread thread1 = new Thread(() -> {
        for(int i = 1; i <= 5; i++)
          {
            System.out.println("thread 1: " + i);
            try{
              Thread.sleep(1000);         // sleep for 1 second
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
      });
      Thread thread2 = new Thread(() -> {
        for(int i = 1; i <= 5; i++)
          {
            System.out.println("Thread 2: " + i);
            try {
              Thread.sleep(1000);
              // sleep for 1 second
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
      });

      // start the threads
      thread1.start();
      thread2.start();

      // wait for both threads to finish
      try {
        thread1.join();
        thread2.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Both threads have finished.");
    }
  }

// 2 thread objects are created; lambda expressions are used to define tasks for each thread 
// start() method is called on each thread to initiate its execution 
// threads run concurrently, printing their respective messages 
// Thread.sleep(1000) method pauses the thread for 1 second, allowing the other thread to execute
// the join() method is called on each thread to wait for it to finish before the main thread continues 
