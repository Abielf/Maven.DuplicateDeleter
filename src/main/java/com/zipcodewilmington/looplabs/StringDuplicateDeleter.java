package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

        public String[] removeDuplicates(int max){
            reset();
            if(max<=1||max>=array.length) {return new String[0];}
            for (Integer i=0;i<array.length;i++){
                if(getNumberOfOccurrences(array[i])>=max){
                    array=removeValue(array[i]);
                    i=0;}
            }
            return array;
        }

    public String[] removeDuplicatesExactly(int exact){
        reset();
        if(exact==0||exact>=array.length) {return array;}
        for (Integer i=0;i<array.length;i++){
            if(getNumberOfOccurrences(array[i])==exact){
                array=removeValue(array[i]);
                i=0;}
        }
        return array;
    }
}
