package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;
    protected T[] original;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
        this.original=intArray;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count=0;
        for(T i:array){
            if (i==valueToEvaluate){count++;}
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        T[] newArray= Arrays.copyOf(array, array.length-getNumberOfOccurrences(valueToRemove));
        int count =0;
        for(int i=0;i< array.length;i++){
            if (array[i]!=valueToRemove){
                newArray[count]=array[i];
                count++;
            }
        }
        return newArray;
    }

    public void reset(){
        array=original;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);


}
