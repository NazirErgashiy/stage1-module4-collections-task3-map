package com.epam.mjc.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        Collection<Integer> collection = functionMap.values();
        return collection.contains(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[sourceList.size()];

        int j = 0;
        for (Integer i : sourceList) {
            arr[j++] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5 * arr[i] + 2;
        }
        for (int i = 0; i < arr.length; i++) {
            map.put(sourceList.get(i), arr[i]);
        }
        return map;
    }
}
