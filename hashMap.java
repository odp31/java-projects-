public class HashMap<K, V>
  {
    private static final int DEFAULT_CAPACITY = 16; 
    private static final double LOAD_FACTOR = 0.75;

    private Entry<K, V>[] table;
    private int size;

    public HashMap()
    {
      table = new Entry[DEFAULT_CAPACITY];
      size = 0;
    }

    static class Entry<K, V>
      {
        K key; 
        V value; 
        Entry<K, V> next;

        public Entry(K key, V value)
        {
          this.key = key; 
          this.value = value; 
          this.next = null;
        }
      }
    private int hash(K key)
    {
      // implement a suitable hash function 
      int hashCode = key.hashCode();
      return hashCode & (table.length - 1);
    }

    public void put(K key, V value)
    {
      int index = hash(key);
      Entry<K, V> head = table[index];

      while (head != null)
        {
          if (head.key.equals(key))
          {
            head.value = value;
            return;
          }
          head = head.next;
        }
      // create new entry 
      Entry<K, V> newEntry = new Entry<>(key, value);
      newEntry.next = table[index];
      table[index] = newEntry; 
      size++;

      // resize table if necessary
      if ((double) size / table.length > LOAD_FACTOR)
      {
        resize();
      }
    }
    public V get(K key)
    {
      int index = hash(key);
      Entry<K, V> head = table[index]; 

      while (head != null)
        {
          if (head.key.equals(key))
          {
            return head.value;
          }
          head = head.next;
        }
      return null;
    }

    public void resize()
    {
      Entry <K, V>[] oldTable = table; 
      table = new Entry[table.length * 2]; 
      size = 0; 

      for (Entry<K, V> entry: oldTable)
        {
          while (entry != null)
            {
              put(entry.key, entry.value); 
              entry = entry.next;
            }
        }
    }
  }
