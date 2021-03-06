package com.company.Task2;

import java.util.Arrays;

/**
 * Created by ALEKSANDR NECHEUKHIN on 04.12.2016.
 */
public class SortedLinearSearch<Type> {
    Type[] Data;

    /////////////
    //Constructor
    /////////////
    SortedLinearSearch(Type[] data) {
        this.Data = (Type[]) new Object[data.length + 1];
        Data = Arrays.copyOf(data, data.length + 1);
    }

    //////////////////////////////////////////////////////
    //Returns the index of the element that has been found
    // or emit exception
    //////////////////////////////////////////////////////
    public int search(Type pattern) throws Exception {
        Data[Data.length - 1] = pattern;
        int index = 0;
        while (true) {
            if (pattern.toString().compareTo(Data[index].toString()) <= 0)
                break;
            index++;
        }
        //Check if the cycle was finished in the end
        if (Data[index].equals(pattern))
            return index;
        else
            throw new Exception("Couldn't find the element");
    }
}
