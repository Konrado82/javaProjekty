import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj iloŚć znaków");
        int howLong = scanner.nextInt();
        System.out.println("Czy wielkie litery(true or false)");
        boolean capitalLetter = scanner.nextBoolean();
        System.out.println("znaki specjalne?(true or false)");
        boolean specialMarks = scanner.nextBoolean();
        System.out.println("cyfry?(true or false)");
        boolean cyphry=scanner.nextBoolean();

        if (capitalLetter){
            howLong--;
        }
        if (specialMarks) {
            howLong--;
        }
        if (cyphry) {
            howLong--;
        }


        String password = new Random().ints(howLong, 97, 122)
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());
        System.out.print(password);


        if (cyphry) {

            String numbers = new Random().ints(1, 48, 57)
                    .mapToObj(i -> String.valueOf((char)i))
                    .collect(Collectors.joining());
            System.out.print(numbers);
        }
        if (capitalLetter) {

            String capitalLetters = new Random().ints(1, 65, 90)
                    .mapToObj(i -> String.valueOf((char) i))
                    .collect(Collectors.joining());
            System.out.print(capitalLetters);
        }
        if (specialMarks) {

            String special = new Random().ints(1, 33, 38)
                    .mapToObj(i -> String.valueOf((char) i))
                    .collect(Collectors.joining());
            System.out.print(special);
        }



    }
}