package com.company;

import java.io.*;
import java.util.TreeSet;

public class Writer {
    public
        Writer(TreeSet<WordData> sorted, Integer count) throws IOException {
            FileWriter fstream = new FileWriter("freq.csv");
            BufferedWriter out = new BufferedWriter(fstream);
            double a;
            for (WordData it : sorted) {
                a = (double) it.getFreq() / (double) count * 100;
                String result = String.format("%.2f",a);
                String str = ""+result;
                str=str.replace(',','.');
                out.write(it.getData() + "," + it.getFreq() + "," + str + "%" + "\n");
                out.flush();
            }
            out.close();
        }
}

