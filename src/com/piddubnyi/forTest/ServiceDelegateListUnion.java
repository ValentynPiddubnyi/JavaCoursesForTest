package com.piddubnyi.forTest;

import java.util.List;

/**
 * Created by fil on 10/23/14.
 */
public class ServiceDelegateListUnion {
    private ListUnion list;

    public ServiceDelegateListUnion(ListUnion list){
        this.list = list;
    }

    public <T> List<T> innerUnion(List<T> firstArray, List<T> secondArray){
        List<T> result = this.list.innerUnion(firstArray,secondArray);
        System.out.println("Inner union result: " + result.toString());
        return result;
    }
}
