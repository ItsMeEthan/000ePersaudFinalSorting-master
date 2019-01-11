package com.company;

public class utilitySort
{
    public static void swap(int list[], int i, int j)
    {
        int temp= list[i];
        list[i]=list[j];
        list[j]=temp;
    }


    public static void swap2(String list[],  int i, int j)
    {
        String temp= list[i];
        list[i]=list[j];
        list[j]=temp;
    }

    public static int minimumIndex(int list[], int ind)
    {
        int minInd = ind;
        for (int i = ind; i <list.length; i++)
        {
            if (list[i] < list[minInd])
            {
                swap(list,i,minInd);
                minInd = i;
            }
        }
        return minInd;
    }
}
