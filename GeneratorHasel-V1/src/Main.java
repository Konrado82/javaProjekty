import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilosć znaków(4-8)");
        int howLong = scanner.nextInt();
        System.out.println("Czy ma być wielka litera(true or false)");
        boolean capitalLetters=scanner.nextBoolean();
        System.out.println("Czy ma być znak specjalny?");
        boolean specialMarks = scanner.nextBoolean();
        System.out.println("Czy ma być cyfra");
        boolean cyphry = scanner.nextBoolean();

        List<String> capitals = List.of("Q", "A", "W", "S", "Z");
        List<String> lowLetters = List.of("a", "q", "w", "e", "s", "d", "h", "r", "t", "f", "g");
        List<String> specialChar = List.of("&", "#", "$");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Random random = new Random();

        String pasword = null;


        if (capitalLetters) {
            int randomElement = random.nextInt(0, 4);
            System.out.print(capitals.get(randomElement));


        }
        if (specialMarks) {
            int randomElement = random.nextInt(0, 2);
            System.out.print(specialChar.get(randomElement));
        }

        if (cyphry) {
            int randomElement = random.nextInt(0, 4);
            System.out.print(numbers.get(randomElement));
        }

        if (capitalLetters){
            howLong--;
        }
        if (specialMarks) {
            howLong--;
        }
        if (cyphry) {
            howLong--;
        }
        for (int i = 0; i < howLong; i++) {

            int randomElement = random.nextInt(0, 10);
            System.out.print(lowLetters.get(randomElement));
        }


    }
}
