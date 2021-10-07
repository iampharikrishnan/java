package Implimentation.DataStructures;

public class Hashing {
    private final int size = 16;
    Node []hashTable = new Node[size];

    private int hashValue(int key){
        return key % this.size;
    }

    public boolean add(int key, int value){
        int hash = hashValue(key);
        Node next=hashTable[hash];
        if(containsKey(key)) return false;
        hashTable[hash] = new Node(key, value, next);
        return true;
    }

    public boolean remove(int key){
        int hash = hashValue(key);
        Node node = hashTable[hash];

        Node entry = containsKey(node, key);

        if(entry==null) return false;
        
        while(node.next != entry){
            node = node.next;
        }
        node.next = entry.next;

        return true;
    }

    public int get(int key){
        int hash = hashValue(key);
        Node node = hashTable[hash];
        Node entry = containsKey(node, key);

        return (entry==null)?Integer.MIN_VALUE:entry.value;
    }

    public boolean containsKey(int key){
        Node node = hashTable[hashValue(key)];
        Node entry = containsKey(node, key);
        return (entry==null)?false:true;
    }

    private Node containsKey(Node node,int key){
        if(node==null) return null;
        if(node.key==key) return node;
        return containsKey(node.next, key);
    }

    class Node{
        int key;
        int value;
        Node next=null;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }

        public Node(int key, int value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
