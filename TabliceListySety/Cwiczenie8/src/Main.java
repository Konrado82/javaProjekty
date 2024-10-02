import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//       Stwórz ArrayListę, na której znajdzie się dziesięć elementów.
//       Stwórz nową listę i przypisz do niej elementy z pierwszej listy w losowej kolejności. Wykorzystaj do tego klasę Random().
//

            ArrayList<String> names = new ArrayList<>();
            names.add("ada");
            names.add("Ola");
            names.add("Ewa");
            names.add("Ala");
            names.add("Olo");
            names.add("Max");
            names.add("Jan");
            names.add("Ela");
            names.add("Zuza");
            names.add("Zosia");

            ArrayList<String> new12 = new ArrayList<>();


            Random random = new Random();
            //random.nextInt(11);

            for (int i =0; i<names.size(); i++){
                int index= random.nextInt(11);
                new12.add(names.get(index));
            }

            for (String rename: new12 ){
                System.out.println(rename);
            }


            for (String name: names ) {
                System.out.println(name);
            }
    }
}