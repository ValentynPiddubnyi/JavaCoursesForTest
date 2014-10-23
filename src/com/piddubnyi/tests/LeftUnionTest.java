package com.piddubnyi.tests;

import com.piddubnyi.forTest.ArraysUnion;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fil on 10/16/14.
 */
public class LeftUnionTest {
    int[] firstArray = {1,4,8,7,9};
    int[] secondArray = {11,4,7,10,0};

    int[] expectedResult = {1,4,8,7,9,4,7};

    @Test
    public void testLeftUnion(){
        int[] result = new int[firstArray.length+secondArray.length];
        ArraysUnion array = new ArraysUnion();
        array.leftUnion(firstArray,secondArray);
        Assert.assertArrayEquals(expectedResult,result);
    }
}
