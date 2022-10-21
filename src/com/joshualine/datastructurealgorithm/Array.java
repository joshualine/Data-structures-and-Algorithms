package com.joshualine.datastructurealgorithm;

public class Array {

    private int[] items;
    private int count;

    //Constructor function
    public Array(int length){
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
    //Insert
    public void insert(int item){
        //first check if the array is full; resize if full. You do by:
        if(items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        for(int i = index; i < count; i++) {
           items[i] = items[i +1];
           count--;
        }
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if (items[i] == item){
                    return i;
            }
        }
        return -1;
    }
}
