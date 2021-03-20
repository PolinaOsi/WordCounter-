package com.company;

public class WordData implements Comparable<WordData> {
    private final
        String data;
    private final
        Integer value;
    public
        WordData (String word, Integer count) {
        data = word;
        value = count;
    }
    public
        int compareTo(WordData o) {
        return -(this.value - o.value) * 2 + (this.data.compareTo(o.data) > 0 ? 1 : -1);
    }
    public
        String getData () {
        return data;
    }
    public
        Integer getFreq() {
        return value;
    }
}
