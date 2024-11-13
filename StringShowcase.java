public class StringShowcase
  {
    public static void main(String[] args)
    {
      String str = "Hello, World!"; 
      int length = str.length();
      System.out.println("Length: " + length); 

      // concatenation
      String concatenated = str + "How are you?"; 
      System.out.println("Concatenated: " + concatenated);

      // substring extraction
      String substring = str.substring(7);
      System.out.println("Substring: " + substring);

      // character at a specific index 
      char charAt5 = str.charAt(5);
      System.out.println("Character at index 5: " + charAt5);

      // String comparison
      String str2 = "hello, world!";
      boolean isEqual = str.equals(str2);
      System.out.println("Strings are equal: " + isEqual);

      // string to uppercase
      String uppercaseStr = str.toUpperCase();
      System.out.println("Uppercase: " + uppercaseStr);

      // string to lowercase
      String lowercaseStr = str.toLowerCase();
      System.out.println("Lowercase: " + lowercaseStr);

      // finding a substring
      int indexOfWorld = str.indexOf("World");
      System.out.println("index of 'world': " + indexOfWorld);

      // replacing a substring 
      String replacedStr = str.replace("World", "Universe");
      System.out.println("Replaced string: " + replacedStr);

      // splitting a string
      String[] words = str.split(" ");
      for (String word: words)
        {
          System.out.println(word);
        }
    }
  }
