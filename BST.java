// BST class implemented in java; left subtree = nodes with keys < current nodes key, right subtree = all nodes w/ keys > current nodes key 
public class BST
  {
    private Node root; 
    private class Node
      {
        int key; 
        Node left, right; 

        public Node(int item)
        {
          key = item; 
          left = right = null;
        }
      }
    // insert a new node into BST
    public void insert(int key)
    {
      root = insertRecursive(root, key);
    }
    private Node insertRecursive(Node root, int key)
    {
      if (root == null)
      {
        root = new Node(key);
        return root;
      }
      if (key < root.key)
      {
        root.left = insertRecursive(root.left, key);
      }
      else if (key > root.key)
      {
        root.right = insertRecursive(root.right, key);
      }
      return root;
    }

    // search for given key in BST
    public boolean search(int key)
    {
      return searchRecursive(root, key);
    }
    private boolean searchRecursive(Node root, int key)
    {
      if (root == null)
      {
        return false;
      }
      if (root.key == key)
      {
        reutrn true;
      }
      if (key < root.key)
      {
        return searchRecursive(root.left, key);
      }
      return searchRecursive(root.right, key);
    }

      // in order traversal of BST
      public void inorder()
    {
      inorderRecursive(root);
    }
    private void inorderRecursive(Node root)
    {
      if(root != null)
      {
        inorderRecursive(root.left);
        System.out.print(root.key + "");
        inorderRecursive(root.right); 
      }
    }
  }
