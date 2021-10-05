package Test;

public class BSTtest {

    Node root;

    public Node remove(int data){
        Node entry = findNode(data);
        return (entry!=null)?removeNode(this.root,entry):null;
    }
    private Node removeNode(Node subtreeRoot, Node entry) {
        Node indirect=subtreeRoot;
        while(indirect!=null && indirect.left!=entry && indirect.right!=entry){
            indirect = (indirect.data>entry.data)?indirect.left:indirect.right;
        }
        
        if(indirect.left==entry){
            if(entry.left==null)
                indirect.left=entry.right;
            else if(entry.right == null)
                indirect.left=entry.left;
            else{
                Node sussoser = minNode(entry.right);
                indirect.left=removeNode(entry,sussoser);
            }
            indirect=indirect.left;
        }
        else{
            if(entry.left==null)
                indirect.right=entry.right;
            else if(entry.right == null)
                indirect.right=entry.left;
            else{
                Node sussoser = minNode(entry.right);
                indirect.right=removeNode(entry,sussoser);
            }
            indirect=indirect.right;
        }
        indirect.left = entry.left;
        indirect.right = entry.right;
        return entry;
    }
    private Node minNode(Node subtreeRoot) {
        Node minNode = subtreeRoot;
        while(minNode!=null && minNode.left!=null){
            minNode=minNode.left;
        }
        return minNode;
    }
    public Node findNode(int data){
        Node indirect = root;
        while(indirect!=null && indirect.data !=data){
            indirect = (indirect.data>data)?indirect.left:indirect.right;
        }
        return indirect;
    }
    
}

class Node{
    int data;
    Node left;
    Node right;
}
