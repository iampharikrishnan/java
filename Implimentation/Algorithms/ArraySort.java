package Implimentation.Algorithms;
import java.util.Scanner;

public class ArraySort {

    public void bubbleSort(int []arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public void selectionSort(int []arr) {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            // Initialise ith index as max element
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the ith element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public void mergeSort(int []arr){
        mergeSort(arr,0,arr.length-1);
    }

    private void mergeSort(int []arr, int startIndex, int lastIndex){
        if(startIndex<lastIndex){
            int middleIndex= startIndex + ((lastIndex-startIndex)/2);

            mergeSort(arr, startIndex,middleIndex);
            mergeSort(arr, middleIndex+1,lastIndex);

            merge(arr, startIndex, middleIndex, lastIndex);
        }
    }
    // Consider it as merging 2 arrays. First array from startIndex to middleIndex 
    // and second array start from middleIndex+1 to lastIndex.
    public void merge(int []arr, int startIndex, int middleIndex, int lastIndex){
        
    }

}
