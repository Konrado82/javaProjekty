import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> nicknames = new ArrayList<>();

        names.add("Gregorina");
        names.add("Leopolda");
        names.add("Genowefa");
        names.add("Adolfa");

        nicknames.add("Żuk");
        nicknames.add("Słońce");
        nicknames.add("Żyrafa");
        nicknames.add("Rosołek");

        Random random = new Random();


        System.out.println(names.get(random.nextInt(4))+" "+nicknames.get(random.nextInt(4)));


    }
}