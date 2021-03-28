package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicates(int max){
        reset();
        if(max<=1||max>=array.length) {return new Integer[0];}
        for (Integer i=0;i<array.length;i++){
            if(getNumberOfOccurrences(array[i])>=max){
                array=removeValue(array[i]);
                i=0;}
        }
        return array;
    }

    public Integer[] removeDuplicatesExactly(int exact){
        reset();
        if(exact==0||exact>=array.length) {return array;}
        for (Integer i=0;i<array.length;i++){
            if(getNumberOfOccurrences(array[i])==exact){ array=removeValue(array[i]);}
        }
        return array;
    }

}
