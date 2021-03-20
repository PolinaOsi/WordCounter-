package com.company;

import java.io.*;
import java.util.HashMap;

public class Read {
    private final
        HashMap<String, Integer> freq = new HashMap<>();
    private
        int count = 0;
    public
       HashMap <String, Integer> getMap () {
            return  freq;
    }
    public
        Integer getCount () {
            return count;
    }
    public
        Read(String[] args) {
            Reader reader = null;
            int bufferSize = 1024;
            char[] buffer = new char[bufferSize];
            StringBuilder text = new StringBuilder();
            StringBuilder word = new StringBuilder();
            try {
                reader = new InputStreamReader(new FileInputStream(args[0]));
                while( true ) {
                    int rsz = reader.read(buffer, 0, buffer.length);
                    if (rsz < 0)
                        break;
                    text.append(buffer, 0, rsz);
                }
                int i = 0;
                int j;
                while (i < text.length()) {
                    for (j = i; Character.isLetterOrDigit(text.charAt(j)); j++) {
                        word.append(text.charAt(j));
                    }
                    if (!word.toString().isEmpty()) {
                        if (!freq.containsKey(word.toString())) {
                            freq.put(word.toString(), 1);
                        } else {
                            freq.put(word.toString(), freq.get(word.toString()) + 1);
                        }
                        count++;
                    }
                    i += word.length() + 1;
                    word = new StringBuilder();
                }
            }
            catch (IOException e) {
                System.err.println("Error while reading file:" + e.getLocalizedMessage());
                }
            finally {
                if (null != reader) {
                    try {
                        reader.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace(System.err);
                    }
                }
            }

        }
}
