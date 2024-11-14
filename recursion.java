// 1. recursive factorial example 
public class Factorial
  {
    public static int factorial(int n)
    {
      if (n==0)
      {
        return 1;
      }
      else
      {
        return n * factorial(n - 1);
      }
    }

    public static void main(String[] args)
    {
      int result = factorial(5);
      System.out.println("Factorial of 5 is: " + result);
    }
  }

// 2. Fibonacci Sequence 
public class Fibonacci
  {
    public static int fibonacci(int n)
    {
      if(n <= 1)
      {
        return n;
      }
      else
      {
        return fibonacci(n - 1) + fibonacci(n - 2);
      }
    }
    public static void main(String[] args)
    {
      int result = fibonacci(6);
      System.out.println("fibonacci of 6 is: " + result);
    }
  }

// 3. Tower of Hanoi 
public class TowerOfHanoi
  {
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary)
    {
      if(n ==1)
      {
        System.out.println("move disk 1 from" + source + "to" + destination);
        return;
      }
      towerOfHanoi(n-1, source, auxiliary, destination);
      System.out.println("Move disk " + n + " from " + source + " to " + destination);
      towerOfHanoi(n-1, auxiliary, destination, source);
    }
    public static void main(String[] args)
    {
      int n = 3;
      towerOfHanoi(n, 'A', 'C', 'C');
    }
  }

// 4. string reversal
public static String reverseString(String str)
  {
  if (str.isEmpty()){
  return str;
} else {
  return reverseString(str.substring(1)) + str.charAt(0); 
}

// 5. rec binary search 
public static int binarySearch(int[] arr, int target, int low, int high)
  {
  if (low > high)
  {
    return -1;
  }
  int mid = (low + high) / 2; 
  if (arr[mid] == target)
  {
    return mid;
  }
  else if (arr[mid] < target)
  {
    return binarySearch(arr, target, mid + 1, high);
  }
  else
  {
    return binarySearch(arr, target, low, mid - 1);
  }
}





