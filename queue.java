// Java code for a queue
// linear data structure that follows First-In-First-Out (FIFO) principle 
// first element added to queue is first one to be removed 

// java.util.Queue provides a standard way to implement queues; one of the common implementations is LinkedList 

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample
  {
    public static void main(String[] args)
    {
      Queue<Integer> queue = new LinkedList<>();

      // add elements to queue 
      queue.add(10);
      queue.add(20);
      queue.add(30);

      // remove and print front element 
      System.out.println("Removed: " + queue.poll());

      // print remaining elements
      System.out.println("Remaining Elements: " + queue);
    }
  }


// implementing a queue using a linkedList 

public class QueueNode
  {
    int data;
    QueueNode next;

    public QueueNode(int data)
    {
      this.data = data;
      this.next = null;
    }
  }
public class Queue
  {
    QueueNode front, rear; 

    public Queue()
    {
      this.front = this.rear = null;
    }

    public void enqueue(int data)
    {
      QueueNode temp = new QueueNode(data);

      if (rear == null)
      {
        front = rear = temp; 
        return;
      }

      rear.next = temp;
      rear = temp;
    }

    public int dequeue()
    {
      if (front == null)
      {
        return -1;
      }
      int data = front.data;
      front = front.next; 
      if(front == null)
      {
        rear = null;
      }
      return data;
    }

    public int peek()
    {
      if(front == null)
      {
        return -1;
      }
      return front.data;
    }
    public boolean isEmpty()
    {
      return front == null;
    }
  }
