package com.piddubnyi.forTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fil on 10/23/14.
 */
public class ListUnion {
    public <T> List<T> innerUnion(List<T> firstArray, List<T> secondArray){
        List<T> result = new ArrayList<T>();
        if(firstArray==null || secondArray==null){
            return result;
        }
        if(firstArray.size()==0 || secondArray.size()==0){
            return result;
        }

        for(T person : firstArray){
            if (secondArray.contains(person)){
                result.add(person);
            }
        }
        return result;
    }
}
