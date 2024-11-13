// heap implemenation using an array 
public class Heap
  {
    private int[] heapArray;
    private int size;
    private int capacity; 

    public Heap(int capacity)
    {
      this.capacity = capacity; 
      heapArray = new int[capacity];
      size = 0; 
    }

    // function to insert a new key into heap 
    public void insertKey(int key)
    {
      if (size == capacity)
      {
        System.out.println("heap overflow");
        return;
      }
      // insert new key at end
    heapArray[size] = key;
    size++; 

    // heapify inserted node up to maintain heap property 
    int i = size - 1; 
    while (i !- 0 && heapArray[parent(i)] < heapArray[i])
      {
        swap(i, parent(i));
        i = parent(i);
      }
    }

    // function to remove the root (maximum element in max heap)
    public int extractMax()
    {
      if(size == 0)
      {
        return Integer.MIN_VALUE;
      }
      int root = heapArray[0];

      // replace root with last element 
      heapArray[0] = heapArray[size - 1]; 
      // heapify root node down to maintain heap property 
      heapify(0);
      return root; 
    }

      // function to heapify a subtree rooted with node i 
    public void heapify(int i)
    {
      int largest = i;
      int left = leftChild(i);
      int right = rightChild(i);

      if(left < size && heapArray[left] > heapArray[largest])
      {
        largest = left;
      }
      if(right < size && heapArray[right] > heapArray[largest])
      {
        largest = right; 
      }
      if(largest != i)
      {
        swap(i, largest);
        heapify(largest);
      }
    }
    // utility functions for parent, left child, and right child indices 
    int parent(int i)
    {
      return (i - 1) / 2;
    }
    int leftChild(int i)
    {
      return 2 * i + 1; 
    }
    int rightChild(int i)
    {
      return 2 * i + 2; 
    }
    // function to swap two elements in array 
    void swap(int i, int j)
    {
      int temp = heapArray[i];
      heapArray[i] = heapArray[j];
      heapArray[j] = temp; 
    }
  }

      
      
