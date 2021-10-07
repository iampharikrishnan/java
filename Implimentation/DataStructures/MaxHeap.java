package Implimentation.DataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MaxHeap implements Iterable<Integer>{
    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

    public boolean add(int data){
        pQueue.add(data);
        return true;
    }

    public int peek(){
        return pQueue.peek();
    }

    public boolean remove(int data){
        return pQueue.remove(data);
    }

    public boolean contains(int data){
        return pQueue.contains(data);
    }

    @Override
    public Iterator<Integer> iterator() {
        return pQueue.iterator();
    }



}

/* Implimenting heap using array
public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;
 
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }
 
    private int parent(int pos) { return (pos - 1) / 2; }
 
    private int leftChild(int pos) { return (2 * pos); }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
    private boolean isLeaf(int pos)
    {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }
 
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    // Recursive function to max heapify given subtree
    private void maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return;
 
        if (Heap[pos] < Heap[leftChild(pos)]
            || Heap[pos] < Heap[rightChild(pos)]) {
 
            if (Heap[leftChild(pos)]
                > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }
 
    public void insert(int element)
    {
        Heap[size] = element;
 
        // Traverse up and fix violated property
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }
 
    public void print()
    {
        for (int i = 0; i <= size / 2; i++) {
            System.out.print(
                " PARENT : " + Heap[i]
                + " LEFT CHILD : " + Heap[2 * i + 1]
                + " RIGHT CHILD :" + Heap[2 * i + 2]);
            System.out.println();
        }
    }
 
    // Remove an element from max heap
    public int extractMax()
    {
        int popped = Heap[1];
        Heap[1] = Heap[size--];
        maxHeapify(1);
        return popped;
    }
}*/
