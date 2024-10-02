import java.util.Collections;
import java.util.List;

public class StringConcentrator {

    String word;

    public String concentrate(String a, String b) {
        return a + b;
    }

    public String concentrate(String a, String b, String c) {
        return a + b + c;
    }

    public String concentrate(String a, List<String> stringList) {
        for (String word : stringList) {
            a += "" +word;
        }
        return a;
    }

    }










