package com.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//An Ordered Linked List having Numbers in ascending order.
public class OrderedList {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> l = new LinkedList<Integer>();
        FileReader fr = new FileReader("C:C:\\Users\\sandesh shetty\\IdeaProjects\\AlgorithmPrograms\\DataStructurePrograms\\Resources\\Data");
        BufferedReader br = new BufferedReader(fr);
        String str;
        String s = "";
        while ((str = br.readLine()) != null) {
            s += str;
        }
        System.out.println(s);
        br.close();

        String[] arr = s.split("");// to split the string array
        int[] arr2 = new int[arr.length];

        // for converting any String type in file to integer type
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        System.out.println(Arrays.toString(arr2));// string representation of array
        l.bubbleSort(arr2);// to arrange the data in ascending order

        for (int i : arr2) // for adding the element to the linkedList
        {
            l.insert(i);
        }
        System.out.println();
//		l.display();
        System.out.println();
        Scanner newn = new Scanner(System.in);
        System.out.println("Provide a number ");
        int num = newn.nextInt();
        boolean bool = l.search(num);
        // l.display();
        if (bool) {
            l.remove(num);
        } else {
            l.serially(num);
        }
        l.display();
    }
}