public class BinaryTree
  {
    class Node
      {
        int data;
        Node left, right; 

        public Node(int item)
        {
          data = item; 
          left = right = null;
        }
      }
    Node root; 

    public BinaryTree()
    {
      root = null;
    }

    // function to insert a new node with given data 
    public void insert(int data)
    {
      root = insertRec(root, data);
    }

    // recursive function to insert a new node with given data in BST 
    Node insertRec(Node root, int data)
    {
      if (root == null)
      {
        root = new Node(data);
        return root; 
      }
      if (data < root.data)
      {
        root.left = insertRec(root.left, data);
      }
      else if (data > root.data)
      {
        root.right = insertRec(root.right, data);
      }
      return root;
    }

    // function to print inorder traversal of tree
    void inorder()
    {
      inorderRec(root);
    }

    // utility function to do inorder traversal of the tree
    void inorderRec(Node root)
    {
      if (root != null)
      {
        inorderRec(root.left);
        System.out.print(root.data + " "); 
        inorderRec(root.right);
      }
    }
  }
