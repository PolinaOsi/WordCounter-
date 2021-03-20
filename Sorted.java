package com.company;

import java.util.*;

public class Sorted {
    private final
        TreeSet<WordData> sorted = new TreeSet<>();
    public
        TreeSet <WordData> getSortFreq() {
        return sorted;
    }
    public
        Sorted(HashMap<String, Integer> freq) {
            for (Map.Entry<String, Integer> entry:freq.entrySet()) {
                WordData newWord = new WordData(entry.getKey(), entry.getValue());
                sorted.add(newWord);
            }
        }
}
