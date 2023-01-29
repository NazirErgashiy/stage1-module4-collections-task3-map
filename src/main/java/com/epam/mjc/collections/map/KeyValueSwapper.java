package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Set<Integer> integerSet = sourceMap.keySet();
        Collection<String> stringCollection = sourceMap.values();

        Map<String, Integer> integerStringMap = new HashMap<>();

        int[] arr = new int[integerSet.size()];
        String[] stringArr = new String[stringCollection.size()];

        int j = 0;
        for (Integer i : integerSet) {
            arr[j++] = i;
        }
        stringCollection.toArray(stringArr);

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (stringArr[i].contains(stringArr[k])) {
                    if (arr[i] > arr[k]) {
                        integerStringMap.put(stringArr[k], arr[k]);
                    } else {
                        integerStringMap.put(stringArr[i], arr[i]);
                    }
                }
            }
        }
        return integerStringMap;
    }
}
