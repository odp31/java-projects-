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


// 3. Jump Search: skips elements in blocks to reduce numComparisons; useful for large arrays where binary search is too slow 
public static int jumpSearch(int[] arr, int target)
  {
  int n = arr.length;
  int step = (int) Math.floor(Math.sqrt(n));
  int prev = 0; 
  while (arr[Math.min(step, n) - 1] < target)
    {
      prev = step; 
      step += (int) Math.floor(Math.sqrt(n));

      if (prev >= n)
      {
        return -1; 
      }
    }
  while (arr[prev] < target)
    {
      prev++;
      if(prev == Math.min(step, n))
      {
        return -1; 
      }
    }
  if(arr[prev] == target)
  {
    return prev;
  }
  return -1;
}

// 4. Interpolation Search: estimates position of target value based on its value relative to endpoints of search interval 
public static int interpolationSearch(int[] arr, int target)
  {
  int low = 0, high = arr.length - 1;
  while(low <= high && target >= arr[low] && target <= arr[high])
    {
      int pos = low + (((high - low) / (arr[high] - arr[low])) * (target - arr[low])));
      if (arr[pos] == target)
      {
        return pos;
      }
      else if (arr[pos] < target)
      {
        low = pos + 1; 
      }
      else
      {
        high = pos - 1; 
      }
    }
  return // not found 
