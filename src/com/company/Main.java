package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] testArr = {"Bob", "Ellie","Joe", "Jake", "Elisabeth", "Susana"};
        int[] testArr2 = {7,2,1,4,10,8,5,6,9,3,21,41,2,42};
        int[] testArr3 = {113,123,145,187,238,67,231,114,199,148,1, 7, 11, 1009, 31};

        System.out.print("BubbleSort");
        System.out.println("Before: ");
        for (String num:testArr)
            System.out.print(num+" ");
        System.out.println();


        bubbleSort.BubbleSort(testArr, testArr.length);

        System.out.print("After: ");
        for (String num:testArr)
            System.out.print(num+ " ");
        System.out.println();

        System.out.println(" ");



        System.out.println("SelectionSort");
        System.out.println("Before: ");
        for (int num:testArr2)
            System.out.print(num+" ");
        System.out.println();


        selectionSort.SelectionSort(testArr2, testArr2.length);

        System.out.print("After: ");
        for (int num:testArr2)
            System.out.print(num+ " ");
        System.out.println();

        System.out.println(" ");



        System.out.println("InsertionSort");
        System.out.println("Before: ");
        for (int num:testArr3)
            System.out.print(num+" ");
        System.out.println();


        insertionSort.InsertionSort(testArr3);

        System.out.print("After: ");
        for (int num:testArr3)
            System.out.print(num+ " ");
        System.out.println();

    }
}
