package com.joshualine.datastructurealgorithm;

import static com.joshualine.datastructurealgorithm.Search.binary_search;
import static com.joshualine.datastructurealgorithm.Search.linear_search;
import static com.joshualine.datastructurealgorithm.Search.jump_search;

public class DataStructureAlgorithm {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(34);
        numbers.insert(35);
        numbers.insert(37);

        // Search Results start here.
        int[] arr = {2,4,5,7,9,10,20,45,67};
        int x = 20;
        int l = 0;
        int r = 8;
//        int result = binary_search(arr, x, l , r);
//        int result = linear_search(arr, x);
        int result = jump_search(arr, x);

        System.out.println(result);
    }
}
