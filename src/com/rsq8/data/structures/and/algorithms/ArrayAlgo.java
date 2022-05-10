package com.rsq8.data.structures.and.algorithms;

public class ArrayAlgo {

    public static Object[] resize(Object[] a, int max) {
        Object[] temp = new Object[max];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        return temp;
    }
}
