package org.pack;

import java.util.List;

public class StringConcentator {
    public String connectString(String text1, String tekst2) {
        return text1 + tekst2;
    }

    public String connectString(String text1, String tekst2, String tekst3) {
        return text1 + tekst2 + tekst3;
    }

    public String connectString(String text1, List<String> text4) {
        for (String word : text4) {
            text1 += "" + word;
        }
        return text1;
    }
}
