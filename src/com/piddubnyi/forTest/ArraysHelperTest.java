package com.piddubnyi.forTest;

import java.util.Arrays;

/**
 * Created by fil on 10/14/14.
 */
public class ArraysHelperTest {
    public static void main(String args[]){
        ArraysHelperTest helperTest = new ArraysHelperTest();
        boolean[] testAssertionResult = new boolean[4];
        testAssertionResult[0] = helperTest.testInnerUnion();
        testAssertionResult[1] = helperTest.testInnerUnionUsecase();
        testAssertionResult[2] = helperTest.testInnerUnionWithEmptyArray();
        testAssertionResult[3] = helperTest.testInnerUnionWithNull();

        int countOfFailedTest =0;
        int countOfSuccessfulTest =0;
        for (boolean result: testAssertionResult){
            if (result)
                countOfSuccessfulTest++;
            else
                countOfFailedTest++;
        }
        System.out.println("Total tcase: " + testAssertionResult.length);
        System.out.println("Failed: " + countOfFailedTest);
        System.out.println("Successful: " + countOfSuccessfulTest);
    }
    public boolean testInnerUnion() {
        int[] arrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] arraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] expecedResult = {1, 4, 5, 32};

        ArraysUnion arrayUnion = new ArraysUnion();
        int[] innerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        int[] outerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        boolean assertionResult = Arrays.equals(expecedResult,innerUnionArray);
        System.out.println("Test inner union Is successful: " + assertionResult);
        return assertionResult;

    }

    public boolean testInnerUnionUsecase() {
        int[] arrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] arraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expecedResult = {1, 5, 5, 32};

        ArraysUnion arrayUnion = new ArraysUnion();
        int[] innerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        int[] outerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        boolean assertionResult = Arrays.equals(expecedResult,innerUnionArray);
        System.out.println("usecase test Is successful: " + assertionResult);
        return assertionResult;

    }

    public boolean testInnerUnionWithNull() {
        int[] arrayFirst = null;
        int[] arraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expecedResult = new int[0];

        ArraysUnion arrayUnion = new ArraysUnion();
        int[] innerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        int[] outerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        boolean assertionResult = Arrays.equals(expecedResult,innerUnionArray);
        System.out.println("union with null Is successful: " + assertionResult);
        return assertionResult;

    }


    public boolean testInnerUnionWithEmptyArray() {
        int[] arrayFirst = new int[0];
        int[] arraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expecedResult = new int[0];


        ArraysUnion arrayUnion = new ArraysUnion();
        int[] innerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        int[] outerUnionArray = arrayUnion.innerUnion(arrayFirst, arraySecond);
        boolean assertionResult = Arrays.equals(expecedResult,innerUnionArray);
        System.out.println("union with empty Is successful: " + assertionResult);
        return assertionResult;

    }
}
