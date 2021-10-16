package Implimentation.DataStructures;

import java.util.Stack;

public class SimpleBST {

    Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertNode(int data) {
        Node loopNode = this.root;
        Node lastNode = null;

        if (loopNode == null) {
            root = new Node(data);
        } else {
            while (loopNode != null) {
                lastNode = loopNode;
                loopNode = (loopNode.data > data) ? loopNode.left : loopNode.right;
            }
            if (data > lastNode.data)
                lastNode.right = new Node(data);
            else if (data < lastNode.data)
                lastNode.left = new Node(data);
        }
    }

    public void removeNode(int data) {
        Node loopNode = this.root;
        Node lastNode = null;

        if (loopNode != null) {
            while (loopNode != null && loopNode.data != data) {
                lastNode = loopNode;
                loopNode = (loopNode.data > data) ? loopNode.left : loopNode.right;
            }

            if (loopNode.left == null) {
                if (lastNode.left == loopNode) {
                    lastNode.left = loopNode.right;
                }
                else{
                    lastNode.right = loopNode.right;
                }
            } else if (loopNode.right == null) {
                if (lastNode.left == loopNode) {
                    lastNode.left = loopNode.left;
                }
                else{
                    lastNode.right = loopNode.left;
                }
            } else {
                Node minNodeInRightTree = lastNode.right;
                Node temp = lastNode;
                while (minNodeInRightTree.left != null) {
                    temp = minNodeInRightTree;
                    minNodeInRightTree = minNodeInRightTree.left;
                }
                loopNode.data = minNodeInRightTree.data;
                temp.left = minNodeInRightTree.right;
            }

        }
    }

    public void preorderTraversal(){
        
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while(!stk.empty()){
            Node currentNode = stk.pop();
            System.out.println(currentNode.data);
            if(currentNode.left!=null){
                stk.push(currentNode.left);
            }
            if(currentNode.right!=null){
                stk.push(currentNode.right);
            }
        }
    }

}
