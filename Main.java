package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Too many arguments");
        }
        if (args.length < 1) {
            System.out.println("Too few arguments");
        }
        Read reader = new Read(args);
        Sorted sort = new Sorted(reader.getMap());
        try {
            Writer writer = new Writer(sort.getSortFreq(), reader.getCount());
        }
        catch (IOException e) {
            System.out.println("Error!");
        }

    }
}
