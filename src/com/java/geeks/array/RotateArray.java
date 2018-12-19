package com.java.geeks.array;

import java.util.Arrays;

public class RotateArray {

	// main method
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(array, 2);
 
        print(array);
    }
 
    // rotate method
    private static void rotate(int[] array, int n)
    {
        int currIndex = 0, newIndex = 0,
            backupVal = array[currIndex], newVal = array[currIndex];
        int i = 0, arrLen = array.length;
        while (i < arrLen) {
            currIndex = newIndex;
 
            // compute the new index for current value
            newIndex = (arrLen - (n % arrLen) + currIndex) % arrLen;
 
            // take backup of new index value
            backupVal = array[newIndex];
 
            // assign the value to the new index
            array[newIndex] = newVal;
 
            newVal = backupVal;
            i++;
        }
    }
 
    // method to print the array
    private static void print(int[] array)
    {
        Arrays.stream(array).forEach(a -> System.out.print(a + " "));
    }
}
