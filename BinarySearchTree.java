class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
class BinarySearchTree 
{ 
  
    Node root; 
  
    BinarySearchTree() 
    { 
        root = null; 
    } 
  
   
   
    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        
        printInorder(node.left); 
  
      
        System.out.print(node.key + " "); 
  
      
        printInorder(node.right); 
    } 

    void aufbausPrint(Node node)
    {
        if(node==null)
        return;

        System.out.print(node.key+" ");
        aufbausPrint(node.left);
        
        aufbausPrint(node.right);
        
    }
  
    
    
    void printInorder()    { 
            printInorder(root);  
         } 

         void aufbausPrint(){
             aufbausPrint(root);
         }
   
  
    // Driver method 
    public static void main(String[] args) 
    { 
        BinarySearchTree tree = new BinarySearchTree(); 
        tree.root = new Node(10); 
        tree.root.left = new Node(30); 
        tree.root.right = new Node(70); 
        tree.root.left.left = new Node(20); 
        tree.root.left.right = new Node(35);
        tree.root.right.right = new Node(80);
        tree.root.right.left = new Node(50);  
  
     
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 

        System.out.println("\nAufbaus");
        tree.aufbausPrint();
  
     
    } 
} 
