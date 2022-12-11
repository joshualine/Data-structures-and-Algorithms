package com.joshualine.datastructurealgorithm;

public class Search {
    public int linearSearch(int[] array, int target){
        for(int i = 0; i < array.length; i++)
            if(array[i] == target){
                return i;
            }
        return -1;
    }

    public int binarySearchRec(int[] arr, int target){
        return binarySearchRec(arr, target, 0, arr.length - 1);
    }
    private int binarySearchRec(int[] array, int target, int left, int right){
        if(right >= left) {
            int middle = (left + right)/2;
            if (target == array[middle])
                return middle;
            else if (target < array[middle])
                return binarySearchRec(array, target, left, middle - 1);
            return binarySearchRec(array, target, middle + 1, right);
        }
        return -1;
    }

    public int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length - 1;
        while(right >= left){
            int middle = (left + right) / 2;
            if(target == array[middle])
                return middle;
            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }

    public static int jump_search(int[] arr, int x) {
        int n = arr.length;
        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(n));

        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x)
        {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if (arr[prev] == x)
            return prev;

        return -1;
    }
}
