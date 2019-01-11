package com.company;

public class bubbleSort extends utilitySort {
    // A function to implement bubble sort

    public static void BubbleSort(String[] list, int n) {

        int i,j;
        for (j = 0; j < n-1; j++)

            // Last i elements are already in place
            for (i = j+1; i < n; i++)
                if (list[j].length()<list[i].length()){
                    swap2(list, j, i);
                }


    }

}