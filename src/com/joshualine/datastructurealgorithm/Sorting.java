package com.joshualine.datastructurealgorithm;

public class Sorting {

    public void bubbleSort(int[] array){
        for(int i = 0; i < array.length; i++)
            for(int j = i + 1; j < array.length; j++)
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
    }
    public static int selection_sort(int[] arr){
        int n = arr.length;
        //Transverse to look for the minimum number
        //switch the two numbers
        return 0;
    }
}
