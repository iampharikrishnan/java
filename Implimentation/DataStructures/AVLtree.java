package Implimentation.DataStructures;

public class AVLtree {
    Node root;

    public boolean insert(int data){
        return (insertNode(this.root, new Node(data))!=null);
    }

    private Node insertNode(Node subtreeRoot,Node newNode) {
        if(subtreeRoot==null)
            return newNode;
        else if(subtreeRoot.data>newNode.data)
            subtreeRoot.left=insertNode(subtreeRoot.left, newNode);
        else if(subtreeRoot.data>newNode.data)
            subtreeRoot.right=insertNode(subtreeRoot.right, newNode);
        else //duplicate key not allowed
            return subtreeRoot;

        subtreeRoot.updateHeight();
        
        int balanceFactor = subtreeRoot.getBalanceFactor();

        // Left Left unbalanced case
        if(balanceFactor > 1 && newNode.data < subtreeRoot.left.data)
            return rightRotation(subtreeRoot);
        // Right right unbalanced
        else if(balanceFactor < -1 && newNode.data > subtreeRoot.right.data)
            return leftRotation(subtreeRoot);
        // Left right unbalanced
        else if(balanceFactor > 1 && newNode.data > subtreeRoot.left.data){
            subtreeRoot.left = leftRotation(subtreeRoot.left);
            return rightRotation(subtreeRoot);
        }
        // Right left unbalanced
        else if(balanceFactor < -1 && newNode.data < subtreeRoot.right.data){
            subtreeRoot.right = rightRotation(subtreeRoot.right);
            return leftRotation(subtreeRoot);
        }
        
        return subtreeRoot;
    }

    private Node rightRotation(Node node) {
        Node x = node.left;
        Node r = x.right;

        // performing rotation
        x.right = node;
        node.left = r;

        //update height
        node.updateHeight();
        x.updateHeight();

        return x;
    }

    private Node leftRotation(Node node) {
        Node x = node.right;
        Node r = x.left;

        // performing rotation
        x.left = node;
        node.right = r;

        //update height
        node.updateHeight();
        x.updateHeight();

        return x;
    }

    public boolean delete(int data){
        return (deleteNode(this.root,data)!=null);
    }

    private Node deleteNode(Node subtreeRoot, int data) {
        // STEP 1: PERFORM STANDARD BST DELETE
        if (root == null)
            return root;
 
        // If the key to be deleted is smaller than
        // the root's key, then it lies in left subtree
        if (data < subtreeRoot.data)
            root.left = deleteNode(root.left, subtreeRoot.data);
 
        // If the key to be deleted is greater than the
        // root's key, then it lies in right subtree
        else if (data > subtreeRoot.data)
            root.right = deleteNode(root.right, subtreeRoot.data);
 
        // if key is same as root's key, then this is the node
        // to be deleted
        else
        {
            if(subtreeRoot.left==null)
                return subtreeRoot.right;
            else if(subtreeRoot.right == null)
                return subtreeRoot.left;
            else{
                int succosser = minValueNode(subtreeRoot);
                subtreeRoot.data = succosser;
                subtreeRoot.right = deleteNode(subtreeRoot, succosser);
            }
        }

        subtreeRoot.updateHeight();
        int balanceFactor = subtreeRoot.getBalanceFactor();

        if (balanceFactor > 1 && root.left.getBalanceFactor() >= 0)
        return rightRotation(root);

    // Left Right Case
    if (balanceFactor > 1 && root.left.getBalanceFactor() < 0)
    {
        root.left = leftRotation(root.left);
        return rightRotation(root);
    }

    // Right Right Case
    if (balanceFactor < -1 && root.right.getBalanceFactor() <= 0)
        return leftRotation(root);

    // Right Left Case
    if (balanceFactor < -1 && root.right.getBalanceFactor() > 0)
    {
        root.right = rightRotation(root.right);
        return leftRotation(root);
    }

    return root;
    }


    private int minValueNode(Node subtreeRootNode) {
        Node minNode = subtreeRootNode;

        while (minNode != null && minNode.left != null) {
            minNode = minNode.left;
        }

        return minNode.data;
    }

    public void inorderTraversal(Node subtreeRoot){
        if( subtreeRoot != null){
            inorderTraversal(subtreeRoot.left);
            System.out.println(subtreeRoot.data);
            inorderTraversal(subtreeRoot.right);
        }
    }



    private class Node{
        int data;
        int height=0;
        Node left=null;
        Node right=null;
        public Node(int data){
            this.data=data;
        }
        public int updateHeight(){
            int leftSubtreeHeight = (this.left!=null)?this.left.height:-1;
            int rightSubtreeHeight = (this.right!=null)?this.right.height:-1;
            return Math.max(leftSubtreeHeight, rightSubtreeHeight)+1;
        }

        public int getBalanceFactor(){
            int leftSubtreeHeight = (this.left!=null)?this.left.height:0;
            int rightSubtreeHeight = (this.right!=null)?this.right.height:0;
            return (leftSubtreeHeight - rightSubtreeHeight);
        }
    }
    
}
