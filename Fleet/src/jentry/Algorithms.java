/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jentry;

import java.util.ArrayList;

/**
 *
 * @author mp18000797
 */
public class Algorithms{
  public static ArrayList<String> bubbleSort(ArrayList<String> list){

        String temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return list;

    } 
   
      public static ArrayList<String> insertionSort(ArrayList<String> list){

        String temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return list;

    } 
      
        //binary Search algorithm
    public static int binarySearch(ArrayList<String>  list, String x)
    {
        int l = 0, r = list.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(list.get(m));

            // Check if x is present at mid
            if (res == 0)
                return m;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        return -1;
    }

    //linear search
    public static int linearSearch(ArrayList<String> list, String x)
    {
        int n = list.size();
        for (int i = 0; i < n; i++)
        {
            if (list.get(i).equalsIgnoreCase(x))
                return i;
        }
        return -1;
    }
}
   
   
       
   
    