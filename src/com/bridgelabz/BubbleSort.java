package com.bridgelabz;
/**
 * Purpose - To used Bubble sort and print the sorted list
 * Author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-24
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 64, 33, 25, 2, 22, 90 };
        bubbleSort(arr);
        System.out.println("Array after sorting is");
        printArray(arr);
    }

    /* This Method is used to print the array */
    private static void printArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }

    /* This Method to sort the array in ascending order */
    private static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

    }

}
