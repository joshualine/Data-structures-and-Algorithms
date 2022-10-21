package com.joshualine.datastructurealgorithm;

public class Search {
    public static int linear_search(int[] arr, int x){
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == x){
                return i;
            }
        return -1;
    }
    public static int binary_search(int[] arr, int x, int l, int r){
        if(r >= l) {
            int mid = l + (r-l)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] > x)
                //we are going left;
                return binary_search(arr, x, l, mid-1);
            if(arr[mid] < x)
                //we are moving right;
                return binary_search(arr, x, mid+1, r);
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
