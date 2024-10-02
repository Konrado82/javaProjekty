import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      1.Wyświetl liczby od 1 do 10
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
            }

//      2.Wyświetl sumę pierwszych N liczb naturalnych,
//      gdzie N jest liczbą podaną przez użytkownika

        System.out.println("Podaj liczę N");
        int endOfinterval = scanner.nextInt();
        int Sum = 0;
        for (int i = 1; i <= endOfinterval; i++) {
            Sum += i;
        }
        System.out.println(Sum);

//      3.Oblicz silnię danej liczby (o liczbę zapytaj użytkownika).

        System.out.println("Podaj liczę ");
        int endOfinterval1 = scanner.nextInt();
        int silnia = 1;

        for (int i = 1; i <= endOfinterval1; i++) {
            silnia *= i;

        }
        System.out.println(silnia);

//        4.Wypisz N pierwszych wyrazów ciągu Fibonacciego (o liczbę N zapytaj użytkownika).


        System.out.println("Podaj liczę elementów ciągu Fibo");
        int fiboElementNumber = scanner.nextInt();
        int a = 0;
        int b = 1;

//        System.out.println(a);
//        System.out.println(b);
        for (int i = 0; i <fiboElementNumber;i++) {
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }

    }
}
