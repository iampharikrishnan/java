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

    public boolean deleteNode(){
        return false;
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
