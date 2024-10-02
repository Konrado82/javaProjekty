import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Policz liczbę wystąpień liter w zdaniu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String string1 = scanner.nextLine();
        string1 = string1.strip().replace(" ","");

//        String string = "kkko";
        int count;
        char ch;

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i<string1.length(); i++){
            ch = string1.charAt(i);

            if (!hashmap.containsKey(ch)){
                hashmap.put(ch, 1);
            }else {
                count = hashmap.get(ch);
                count++;
                hashmap.replace(ch, count);

            }
        }
        for (Character key : hashmap.keySet()){
            System.out.println(key+ " "+ hashmap.get(key));
        }


    }
}