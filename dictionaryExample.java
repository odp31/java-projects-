import java.util.Hashtable;

public class DictionaryExample
  {
    public static void main(String[] args)
    {
      Hashtable<String, Integer> phonebook = new Hashtable<>(); 
      // add entries
      phonebook.put("Alice", 123456);
      phonebook.put("Bob", 789012);

      // retrieve a value
      int alicePhone = phonebook.get("Alice");
      System.out.println("Alice's phone number: " + alicePhone);

      // remove an entry 
      phonebook.remove("Bob");

      // check if a key exists 
      boolean hasCharlie = phonebook.containsKey("Charlie);
      System.out.println("Is Charlie in the phonebook?" + hasCharlie); 
    }
  }
