import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();

        Instant before = Instant.now();
        for (int i =0; i<100_000_000;i++);
        int number = random.nextInt(100_000_000) + 1;
        numbers.add(number);

        Instant after = Instant.now();

        Duration result = Duration.between(before, after);
        System.out.println(result.toMillis());

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj datę urodzin (2024-08-22)");
//
//        String s = scanner.nextLine();
//        LocalDate dateOfBirth = LocalDate.parse(s);
//
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//
//        Period period = Period.between(dateOfBirth, now);
//        System.out.println("Masz"+period.getYears()+"lat");
//        System.out.println("Masz"+period.getMonths()+"miesiecy");
//        System.out.println("Masz"+period.getDays()+"dni");


    }
}