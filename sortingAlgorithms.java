// #1. Bubble Sort: compares adjacent elements and swaps them if they are in wrong order 
// runs in O(n^2) in worst/average cases 

public static void bubbleSort(int[] arr)
  {
  int n = arr.length;
  for(int i = 0; i < n - 1; i ++
      {
      for(int j = 0; j < n -i - 1; j ++
          {
            if (arr[j] > arr[j+1])
            {
              int temp = arr[j]; 
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
      }
  }
}

// #2. Selection Sort: finds minimum element in unsorted part and swaps it with first element 
// O(n^2) in all cases 
public static void selectionSort(int[] arr)
  {
  int n = arr.length; 
  for (int i = 0; i < n - 1; i++)
    {
      int minIdx = i;
      for(int j = i+1; j < n; j++)
        {
          if(arr[j] < arr[minIdx])
          {
            minIdx = j;
          }
        }
      int temp = arr[minIdx];
      arr[minIdx] = arr[i]; 
      arr[i] = temp; 
    }
}


// 3. Insertion Sort: iterates through array, inserting each element into correct possition
// O(n) in best case, O(n^2) in worst case 
public static void insertionSort(int[] arr)
  {
  int n = arr.length;
  for(int i = 1; i < n; i++)
    {
      int key = arr[i];
      int j = i - 1; 
      while (j >= 0 && arr[j] > key)
        {
          arr[j + 1] = arr[j];
          j = j - 1; 
        }
      arr[j+1] = key; 
    }
}

// 4. Merge Sort: recursively divides array into two havles, sorts them independently and merges them 
// O(n log n) in all cases 
public static void mergeSort(int[] arr, int l, int r)
  {
  if (l < r)
  {
    int m = (l + r) / 2; 
    mergeSort(arr, l, m);
    mergeSort(arr, m + 1, r); 
    merge(arr, l, m, r); 
  }
}

public static void merge(int[] arr, int l, int m, int r)
  {
  int n1 = m - l + 1; 
  int n2 = r - m;
  int[] L = new int[n1]; 
  int[] R = new int[n2]; 
  for(int i = 0; i < n1; i++)
    {
      L[i] = arr[l + i]; 
      for(int j = 0; j < n2; j ++)
        {
          R[j] = arr[m+ 1 + j]; 
        }
      int i = 0, j = 0 
      int k = l; 
      while (i < n1 && j < n2)
        {
          if (L[i] <= R[j]) {
            arr[k] = L[i]; 
            i++; 
          }
          else
          {
            arr[k] = R[j];
            j++; 
          }
          k ++;
        }
      while(i < n1)
        {
          arr[k] = L[i];
          i++;
          k++;
        }
      while (j < n2)
        {
          arr[k] = R[j];
          j++; 
          k++;
        }
    }
}


// 5. Quick Sort: picks a pivot element, partitions array into two subarrays and recursively sorts them 
// average time complexity of O(n log n), worst case O(n^2) 
public static void quickSort(int[] arr, int low, int high)
  {
  if (low < high)
  {
    int pi = partition(arr, low, high); 
    quickSort(arr, low, pi = 1); 
    quickSort(arr, pi + 1, high); 
  }
}

public static int partition(int[] arr, int low, int high)
  {
  int pivot = arr[high];
  int i = (low - 1); 
  for (int j = low; j < high; j++)
    {
      if (arr[j] <= pivot)
      {
        i++;
        int temp = arr[i]; 

        arr[i] = arr[j]; 
        arr[j] = temp; 
      }
    }
  int temp = arr[i + 1]; 
  arr[i + 1] = arr[high]; 
  arr[high] = temp; 
  return i + 1; 
}
