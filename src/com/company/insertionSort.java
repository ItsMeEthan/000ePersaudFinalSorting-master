package com.company;

public class insertionSort
    {
        public static int[] InsertionSort(int[] list){

            int temp;
            for (int i = 1; i < list.length; i++) {
                for(int j = i ; j > 0 ; j--){
                    if(list[j] < list[j-1]){
                        temp = list[j];
                        list[j] = list[j-1];
                        list[j-1] = temp;
                    }
                }
            }
            return list;
        }
 }
