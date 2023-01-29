package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        sentence = sentence.toLowerCase();

        StringTokenizer stringTokenizer = new StringTokenizer(sentence, " .,");
        Set<String> set = new LinkedHashSet<>();
        String[] stringArr = new String[stringTokenizer.countTokens()];
        for (int i = 0; stringTokenizer.hasMoreTokens(); i++) {
            String getter = stringTokenizer.nextToken();
            set.add(getter);
            stringArr[i] = getter;
        }

        int[] counter = new int[stringArr.length];
        String[] arr = new String[set.size()];
        set.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (String s : stringArr) {
                if (arr[i].contains(s)) {
                    counter[i]++;
                }

            }
        }
        Iterator<String> iterator = set.iterator();

        for (int i = 0; iterator.hasNext(); i++) {
            map.put(iterator.next(), counter[i]);
            System.out.println(counter[i]);
        }

        return map;
    }
}
