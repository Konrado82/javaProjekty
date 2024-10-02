import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//Stwórz dwie ArrayListy i każdą z nich wypełnij dziesięcioma imionami.
// Wypisz te imiona, które są obecne w obu listach
// nie korzystając z metod retainAll(), filter() oraz contains().
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Ala");
        lista1.add("Ola");
        lista1.add("Ela");
        lista1.add("Ada");
        lista1.add("Piotr");

        ArrayList<String> lista2 = new ArrayList<>();
        lista1.add("Ala");
        lista1.add("Mac");
        lista1.add("Val");
        lista1.add("Daria");
        lista1.add("Piotr");

        for (String name : lista1) {
            for (String name2 : lista2) {
                if (name.equals(name2)) {
                    System.out.println(name);
                }
            }
        }
    }
}