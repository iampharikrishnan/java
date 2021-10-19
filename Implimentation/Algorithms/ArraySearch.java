package Implimentation.Algorithms;

public class ArraySearch {

    /**
     * Linear search return index if key is present or -1. 
     * Its works on sorted and unsorted array. It takes O(n) time complexity.
     * @param arr
     * @param key
     * @return 
     */

    public int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    } 
    
    //-----------------------------linear search ended--------------------------//

    /**
     * Binary search return index of data if data found or -1.
     * Binary search only work on sorted array.
     * Search is done in O(log n) time complexity
     * In this it check if middle value is what we are looking for.
     * if not if middle value < data repeat search on left sub array
     * else search on right sub array
     * @param arr
     * @param startIndex
     * @param lastIndex
     * @param data
     * @return
     */
    
    int binarySearch(int arr[], int startIndex, int lastIndex, int data)
    {
        if (lastIndex >= startIndex) {
            int middleIndex = startIndex + (lastIndex - startIndex) / 2;
 
            // Check if middle element is what we are searching for
            if (arr[middleIndex] == data)
                return middleIndex;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[middleIndex] > data)
                return binarySearch(arr, startIndex, middleIndex - 1, data);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, middleIndex + 1, lastIndex, data);
        }
 
        // return -1 if data not present in array
        return -1;
    }
}
