package Implimentation.DataStructures;

import java.util.Scanner;

public class BST {
    private Node root;

    // This is node for BST
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

        public boolean hasRightSubtree() {
            return this.right != null;
        }

        public boolean hasLeftSubtree() {
            return this.left != null;
        }

        // public boolean isLeafNode() {
        //     return !(hasLeftSubtree() || hasRightSubtree());
        // }
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
        return (removeNodeOfSubtree(data, root) != null);
    }

    private Node removeNodeOfSubtree(int data, Node subtreeRootNode) {

        if (subtreeRootNode != null) {
            if (subtreeRootNode.data > data) {
                subtreeRootNode.setRight(removeNodeOfSubtree(data, subtreeRootNode.getLeft()));
            } else if (subtreeRootNode.data > data) {
                subtreeRootNode.setLeft(removeNodeOfSubtree(data, subtreeRootNode.getRight()));
            } else {
                if (!subtreeRootNode.hasLeftSubtree())
                    return subtreeRootNode.getRight();
                if (!subtreeRootNode.hasRightSubtree())
                    return subtreeRootNode.getLeft();
                int minValue = minOfSubtree(subtreeRootNode.getRight());
                subtreeRootNode.setRight(removeNodeOfSubtree(minValue, subtreeRootNode));
            }
        }

        return subtreeRootNode;
    }

    public int minValue(){
        return minOfSubtree(this.root);
    }

    private int minOfSubtree(Node subtreeRootNode) {
        Node minNode = subtreeRootNode;

        while (minNode != null && minNode.getLeft() != null) {
            minNode = minNode.getLeft();
        }

        return minNode.data;
    }

    public int maxValue(){
        return maxOfSubtree(this.root);
    }

    private int maxOfSubtree(Node subtreeRootNode) {
        Node minNode = subtreeRootNode;

        while (minNode != null && minNode.hasRightSubtree()) {
            minNode = minNode.getRight();
        }

        return minNode.data;
    }

    public void traverse(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose how to traverse: ");
        System.out.println("1. Inorder traversal");
        System.out.println("2. Preorder traversal");
        System.out.println("3. Postorder traversal");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: inorderTraversal(this.root);
                break;

            case 2: preorderTraversal(this.root);
                break;

            case 3: postorderTraversal(this.root);
                break;
        
            default:
                System.out.println("Entered choice was invalid.");
        }

        sc.close();

    }

    private void inorderTraversal(Node subtreeRoot){
        
        if( subtreeRoot != null){
            inorderTraversal(subtreeRoot.getLeft());
            System.out.println(subtreeRoot.getData());
            inorderTraversal(subtreeRoot.getRight());
        }
    }

    private void preorderTraversal(Node subtreeRoot){
        
        if( subtreeRoot != null){
            System.out.println(subtreeRoot.getData());
            preorderTraversal(subtreeRoot.getLeft());
            preorderTraversal(subtreeRoot.getRight());
        }
    }

    private void postorderTraversal(Node subtreeRoot){
        
        if( subtreeRoot != null){
            postorderTraversal(subtreeRoot.getLeft());
            postorderTraversal(subtreeRoot.getRight());
            System.out.println(subtreeRoot.getData());
        }
    }

}
