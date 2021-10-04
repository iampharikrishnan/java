package DataStructures;

public class BST {
    private Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        // Constructors of Node
        public Node(int data) {
            this.data = data;
        }

        // getters and setters of Node
        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public boolean hasRightSubtree(){
            return this.right != null;
        }

        public boolean hasLeftSubtree(){
            return this.left != null;
        }

        public boolean isLeafNode(){
            return !(hasLeftSubtree() || hasRightSubtree());
        }
    }

    // Constructors of BST
    public BST(Node root) {
        this.root = root;
    }

    public BST() {
    }

    public boolean insertNode(int data) {
        Node loopNode = this.root;
        Node lastNode = null;
        boolean insertStatus = true;

        if (loopNode == null) {
            root = new Node(data);
        } else {
            while (loopNode != null) {
                lastNode = loopNode;
                loopNode = (loopNode.getData() > data) ? loopNode.getLeft() : loopNode.getRight();
            }
            if (data > lastNode.getData())
                lastNode.setRight(new Node(data));
            else if (data < lastNode.getData())
                lastNode.left = new Node(data);
            else
                insertStatus = !insertStatus;
        }

        return insertStatus;
    }

    public boolean removeNode(int data) {
        Node loopNode = root;
        
        if (loopNode != null) {
            while (loopNode.getData() != data) {
                loopNode = (data > loopNode.getData()) ? loopNode.getRight() : loopNode.getLeft();
            }
            if(loopNode.isLeafNode()){
                
            }
            // minOfSubtree(loopNode.getRight());

        }
        return true;
    }

    private boolean removeNodeOfSubtree(){
        Node loopNode = root;
        
        if (loopNode != null) {
            while (loopNode.getData() != data) {
                loopNode = (data > loopNode.getData()) ? loopNode.getRight() : loopNode.getLeft();
            }
            
            if(loopNode.getLeft()==null

        }
        return true;
    }

    private Node minOfSubtree(Node subtreeRootNode) {
        Node minNode = subtreeRootNode;

        while (minNode != null && minNode.getLeft() != null) {
            minNode = minNode.getLeft();
        }

        return minNode;
    }

}
