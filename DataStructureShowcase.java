import java.util.*;

public class DataStructureShowcase
  {
    public static void main(String[] args)
    {
      int[] numbers = {1, 2, 3, 4, 5};
      System.out.println("Array: " + Arrays.toString(numbers));

      // ArrayList: dynamic array that can grow or shrink as needed 
      List<String> names = new ArrayList<>();
      names.add("Alice");
      names.add("Bob"):
      names.add("Charlie");
      System.out.println("ArrayList: " + names);

      // LinkedList: linear data structure where elements are not stored in contiguous memory locations 
      LinkedList<Integer> linkedlist = new LinkedList<>();
      linkedList.add(10);
      linkedList.add(20);
      linkedList.add(30);
      System.out.println("LinkedList: " + linkedList);

      // Stack: LIFO data structure (last in first out) 
      Stack<Character> stack = new Stack<>();
      stack.push('A');
      stack.push('B');
      stack.push('C');
      System.out.println("Stack: " + stack);

      // Queue: FIFO data structure (first in first  out)
      Queue<String> queue = new LinkedList<>();
      queue.offer("first");
      queue.offer("second");
      queue.offer("third");
      System.out.println("Queue: " + queue); 

      // HashMap: Key-Value pair data structure that stores elements based on a hash code of the key 
      Map<String, Integer> ages = new HashMap<>();
      ages.put("Alice", 25);
      ages.put("Bob", 30);
      ages.put("Charlie", 28);
      System.out.println("HashMap: " + ages);

      // HashSet: set of unique elements 
      Set<Integer> uniqueNumbers = new HashSet<>();
      ages.put("Alice", 25);
      ages.put("Bob", 30);
      ages.put("Charlie", 28);
      System.out.println("HashMap: " + ages); 

      // TreeSet: sorted set of unique elements 
      Set<String> sortedNames = new TreeSet<>();
      sortedNames.add("Alice");
      sortedNames.add("Bob");
      sortedNames.add("Charlie");
      System.out.println("TreeSet: " + sortedNames);
    }
  }
