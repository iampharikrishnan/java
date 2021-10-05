package Implimentation.DataStructures;

public class BinarySearchTree<D extends Comparable<D>> {
    Node<D> root;

    private class Node<T> {
        private T data;
        private Node<T> left = null;
        private Node<T> right = null;
        
        public Node(T data) {
            this.data = data;
        }

    };

    public BinarySearchTree() {
    }

    public BinarySearchTree(BinarySearchTree<D>.Node<D> root) {
        this.root = root;
    }

    boolean insertNode(D data) {
        Node<D> currentNode = this.root;
        Node<D> activeNode = null;

        if (currentNode == null) {
            root = new Node<D>(data);
        } else {
            // TODO: Compare the node value and given data.
            // TODO: Insert in correct position
            while (currentNode != null) {
                activeNode = currentNode;
                // int lt = D.compareTo(currentNode.data)
                // currentNode = ()?
            }
            // if()
        }

        return true;
    }

}
