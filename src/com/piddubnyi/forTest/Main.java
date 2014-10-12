package com.piddubnyi.forTest;

import java.util.Arrays;

/**
 * Created by fil on 10/9/14.
 */
public class Main {
    public static void main(String args[]){

        int[] arrayFirst = {1,5,4,23,65,32,78};
        int[] arraySecond = {3,5,24,4,1,2,34,45,32,5};

        ArraysUnion arrayUnion = new ArraysUnion();
        System.out.println("First array: \t" + Arrays.toString(arrayFirst) + "\nSecond array: \t" + Arrays.toString(arraySecond));
        System.out.println("Inner union: \t" + Arrays.toString(arrayUnion.innerUnion(arrayFirst, arraySecond)));
        System.out.println("Outer union: \t" + Arrays.toString(arrayUnion.outerUnion(arrayFirst, arraySecond)));
    }




}
