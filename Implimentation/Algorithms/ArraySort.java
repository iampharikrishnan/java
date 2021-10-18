package Implimentation.Algorithms;
// import java.util.Scanner;

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

    //Recurcively call this function to devide array into to parts 
    //till there is only one element(conceptually)
    //then call merge to merge the 2 half and it will sort the array
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
    // The subarray will be sorted. just insert smallest element first of 2 arrays to output array.
    private void merge(int []arr, int startIndex, int middleIndex, int lastIndex){
        // Find sizes of two subarrays to be merged
        int leftSubArraySize = middleIndex - startIndex + 1;
        int rightSubArraySize = lastIndex - middleIndex;
  
       
        int leftSubArray[] = new int[leftSubArraySize];
        int rightSubArray[] = new int[rightSubArraySize];
  
        //Copy data to temp arrays
        for (int i = 0; i < leftSubArraySize; ++i)
            leftSubArray[i] = arr[startIndex + i];
        for (int j = 0; j < rightSubArraySize; ++j)
            rightSubArray[j] = arr[middleIndex + 1 + j];
  
        
  
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = startIndex;

        // Merge the temp arrays
        while (i < leftSubArraySize && j < rightSubArraySize) {
            if (leftSubArray[i] <= rightSubArray[j]) {
                arr[k] = leftSubArray[i];
                i++;
            }
            else {
                arr[k] = rightSubArray[j];
                j++;
            }
            k++;
        }
  
        // Copy remaining elements of L[] if any
        while (i < leftSubArraySize) {
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }
  
        // Copy remaining elements of R[] if any 
        while (j < rightSubArraySize) {
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }

    }



}
