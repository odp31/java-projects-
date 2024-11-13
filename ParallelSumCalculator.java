// java class that utilizes parallelism to efficiently process large array of numbers

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask; 

public class ParallelSumCalculator
  {
    public static class SumTask extends RecursiveTask <Integer>
      {
        private final int[] numbers; 
        private final int start; 
        private final int end;

        public SumTask(int[] numbers, int start, int end)
        {
          this.numbers = numbers;
          this.start = start;
          this.end = end;
        }

        @Override
        protected Integer compute()
        {
          if(end - start <= 10,000) // threshold for sequential computation 
          {
            int sum  = 0; 
            for (int i = start; i <= end; i++)
              {
                sum += numbers[i];
              }
            return sum;
          } else {
            int mid = start + (end - start) / 2; 
            SumTask leftTask = new SumTask(numbers, start, mid);
            SumTask rightTask = new SumTask(numbers, mid+1, end);

            leftTask.fork();
            rightTask.fork();
            return leftTask.join() + rightTask.join();
          }
        }
      }
    public static void main(String[] args)
    {
      int[] numbers = new int[100,000,000];
      // populate array with numbers 

      ForkJoinPool pool = new ForkJoinPool();
      SumTask task = new SumTask(numbers, 0, numbers.length - 1); 
      int sum = pool.invoke(task);

      System.out.println("Sum of numbers: " + sum);
    }
  }

    
