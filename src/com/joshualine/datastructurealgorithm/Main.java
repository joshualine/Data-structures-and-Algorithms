package com.joshualine.datastructurealgorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {6,4,9,7,1,10,2,45,6};
        var search = new Search();
        var sort = new Sorting();
        int index = search.linearSearch(numbers, 7);
        int index2 = search.binarySearch(numbers, 6);
        sort.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
