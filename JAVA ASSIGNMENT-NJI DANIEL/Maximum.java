package com.company;// java program to find maximum
// element

public class Maximum
{
    public static int Maximum(int arr[], int low, int high)
    {
        int max = arr[low];
        int i;
        for (i = low; i <= high; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // main function
    public static void main (String[] args)
    {
        int arr[] = {1, 30, 40, 50, 60, 70, 23, 20};
        int n = arr.length;
        System.out.println("The maximum element is "+
                Maximum(arr, 0, n-1));
    }
}