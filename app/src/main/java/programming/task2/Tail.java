/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package programming.task2;

import java.io.*;
import java.nio.*;

public class Tail{

    public String TailStrings(String text, int count) throws IOException {
        String[] strings = text.split(System.getProperty("line.separator"));
        StringBuilder res = new StringBuilder();
        for (int i = Math.max(0, strings.length - count); i < strings.length; i++) {
            res.append(strings[i]);
            if (i != strings.length - 1)
                res.append(System.getProperty("line.separator"));
        }
        return res.toString();
    }

    public String TailSymbols(String text, int count) {
        text = text.replace(System.getProperty("line.separator"), "");
        return text.substring(text.length() - count);
    }

}
