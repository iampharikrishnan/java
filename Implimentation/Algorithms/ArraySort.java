package Implimentation.Algorithms;

public class ArraySort {
/**
 * Bubble sort is simplest of sorting algorithm. We bubble largest element to last index
 * to get the array sorted. It has a O(n^2) complexity.
 * @param arr
 */
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    //-------------------------------Bubble sort ended------------------------------

    /**
     * Selection sort is a simple sorting technique where we select smallest element first
     * position it as first element and repeat the process for rest of unsorted array.
     * Repeating this for n-1 times will sort this array. It have a complexity of O(n^2).
     * @param arr
     */

    public void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Initialise ith index as max element
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the ith element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    //-----------------------------------Selection sort ended-----------------------------

    /**
     * Merge sort takes array as input and sort the array in O(nlogn) time complexity.
     * It ues divide and conquere technique to devide the array in half till there is 
     * only one element left. Then merge or combine in a sorted way. Its easy because we
     * have to just merge 2 sorted array. So insert smalest element in both array.
     * Repeating this will get you a sorted array. Initially you have to merger 2 array
     * with one element(since we split to that point). Then merge 2 subarray that we sorted 
     * before.
     * @param arr
     */

    public void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    // Recurcively call this function to devide array into to parts
    // till there is only one element(conceptually)
    // then call merge to merge the 2 half and it will sort the array
    private void mergeSort(int[] arr, int startIndex, int lastIndex) {
        if (startIndex < lastIndex) {
            int middleIndex = startIndex + ((lastIndex - startIndex) / 2);

            mergeSort(arr, startIndex, middleIndex);
            mergeSort(arr, middleIndex + 1, lastIndex);

            merge(arr, startIndex, middleIndex, lastIndex);
        }
    }

    // Consider it as merging 2 arrays. First array from startIndex to middleIndex
    // and second array start from middleIndex+1 to lastIndex.
    // The subarray will be sorted. just insert smallest element first of 2 arrays
    // to output array.
    private void merge(int[] arr, int startIndex, int middleIndex, int lastIndex) {
        // Find sizes of two subarrays to be merged
        int leftSubArraySize = middleIndex - startIndex + 1;
        int rightSubArraySize = lastIndex - middleIndex;

        int leftSubArray[] = new int[leftSubArraySize];
        int rightSubArray[] = new int[rightSubArraySize];

        // Copy data to temp arrays
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
            } else {
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

    //-------------------------------Merge sort ended-------------------------------

    /**
     * Insertion sort take array as parameter and sort in O(n^2)
     * Insertion sort 
     * @param arr
     */

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are greater than key, to one position
             * ahead of their current position
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    //----------------------------------------Insertion sort ended----------------------

    /**
     * Quick sort takes array as input and sort in O(n^2) complexity. But still considered
     * best algorithm because inner loops are efficient
     * This sorting technique takes one element, place it in its right position
     * then recursively dose same for left and right unsorted array elements.
     * @param arr
     */
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int startIndex, int lastIndex) {
        if (startIndex < lastIndex) {
            // arr[partitionIndex] is now the value if the array is sorted.
            int partitionIndex = partition(arr, startIndex, lastIndex);

            // Separately sort elements before partition and after partition
            quickSort(arr, startIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, lastIndex);
        }
    }
    //just to swap 2 elements in an array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //In this method we take the lastIndex element and move its right position
    private int partition(int[] arr, int startIndex, int lastIndex) {
        int pivot = arr[lastIndex]; 
      
        int i = (lastIndex - 1); 
      
        for(int j = startIndex; j <= lastIndex - 1; j++)
        {
              
            // If current element is smaller then swap
            if (arr[j] < pivot) 
            {
                i++; 
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, lastIndex);
        return (i + 1); 
    }

    //-------------------------------Quick sort ended-------------------------------

}
