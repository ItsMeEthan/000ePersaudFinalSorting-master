package com.company;

public class selectionSort extends utilitySort {

    public static void SelectionSort(int list[], int n) {
        int i=0;
        int j=1;
        {
            for (i = 0; i < n-1; i++)

                // Last i elements are already in place
                for (j = 0; j < n-i-1; j++)
                    if (list[j] > list[j+1])
                        minimumIndex(list, j);

        }
        }
    }