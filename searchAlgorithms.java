// 1. Linear search; traverses whole sequence till it finds is (O(n))
public static int linearSearch(int[] arr, int key)
  {
  for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == key)
      {
        return i;
      }
    }
  return -1; 
}

// 2. Binary Search: efficient for sorted arrays, O(log n) time complexity 
public static int binarySearch(int[] arr, int key)
  {
  int low = 0;
  int high = arr.lenght - 1; 
  while (low <= high)
    {
      int mid = (low + high) / 2; 
      if (arr[mid] < key)
      {
        low = mid + 1; 
      }
      else if (arr[mid] > key)
      {
        high = mid - 1; 
      }
      else
      {
        return mid;
      }
    }
  return -1; 
}
