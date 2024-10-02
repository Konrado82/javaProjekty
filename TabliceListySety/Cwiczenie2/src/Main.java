import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Poproś użytkownika o wpisanie dowolnego zdania, a następnie wykorzystując HashMapę
//        policz liczbę wystąpień każdej litery w zdaniu.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podeaj tekst");
        String string1 = scanner.nextLine();
        string1 = string1.strip().replace(" ","");

//        String string = "kkko";
        int count;
        char ch;

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i<string1.length(); i++){
            ch = string1.charAt(i);
            if (hashmap.containsKey(ch)){
                count = hashmap.get(ch);
                count++;
                hashmap.replace(ch, count);
            }else {
                hashmap.put(ch, 1);
            }
        }
        for (Character key : hashmap.keySet()){
            System.out.println(key+ " "+ hashmap.get(key));
        }

    }
}