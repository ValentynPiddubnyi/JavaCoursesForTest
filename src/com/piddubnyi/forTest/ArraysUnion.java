package com.piddubnyi.forTest;

import java.util.Arrays;

/**
 * Created by fil on 10/12/14.
 */
public class ArraysUnion {
    public int[] innerUnion(int[] firstArray, int[] secondArray){
        if(firstArray==null || secondArray==null){
            return new int[0];
        }
        if(firstArray.length==0 || secondArray.length==0){
            return new int[0];
        }
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int[] preResult = new int[(firstArray.length > secondArray.length) ? firstArray.length : secondArray.length];
        int resultSize =0;
        for(int i=0;i < firstArray.length;i++){
            for(int j=0; j < secondArray.length;j++){
                if(i == 0 && firstArray[i]==secondArray[j]){
                    preResult[resultSize] = firstArray[i];
                    resultSize++;
                    break;
                }
                if(firstArray[i]==secondArray[j] && firstArray[i]!=firstArray[i-1]){
                    preResult[resultSize] = firstArray[i];
                    resultSize++;
                    break;
                }
            }
        }
        int[] result = Arrays.copyOf(preResult,resultSize);
        return result;
    }

    public int[] outerUnion(int[] firstArray, int[] secondArray){
        int[] firstArrayUnic = outerUnionForFirst(firstArray,secondArray);
        //System.out.println(Arrays.toString(firstArrayUnic));
        int[] secondArrayUnic = outerUnionForFirst(secondArray,firstArray);
        //System.out.println(Arrays.toString(secondArrayUnic));
        int[] result = new int[firstArrayUnic.length + secondArrayUnic.length];
        System.arraycopy(firstArrayUnic,0,result,0,firstArrayUnic.length);
        System.arraycopy(secondArrayUnic,0,result,firstArrayUnic.length,secondArrayUnic.length);
        return result;
    }

    private int[] outerUnionForFirst(int[] firstArray, int[] secondArray){
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int[] preResult = new int[firstArray.length];
        int resultSize =0;
        for(int i=0;i < firstArray.length;i++){
            boolean notEqual = false;
            for(int j=0; j < secondArray.length;j++){
                if(firstArray[i]==secondArray[j]){
                    notEqual = false;
                    break;
                }
                notEqual= true;
            }
            if(notEqual){
                preResult[resultSize] = firstArray[i];
                resultSize++;
            }
        }
        int[] result = Arrays.copyOf(preResult,resultSize);

        return result;
    }
}
