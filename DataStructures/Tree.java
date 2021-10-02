package DataStructures;

public class Tree<T> {

    private class Node<T>{
        private T data;
        private Node<T> left=null;
        private Node<T> right=null;

        public Node() {}

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> left, Node<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    
}



