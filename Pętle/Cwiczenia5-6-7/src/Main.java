import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Wypisz sumę liczb parzystych i nieparzystych z podanego przedziału.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj początek przedziału");
        int startOfinterval = scanner.nextInt();
        System.out.println("Podaj koniec przedziału");
        int endOfinterval = scanner.nextInt();
        int SumEvenNamber = 0;
        int SumOddNumber = 0;

        for (int i = startOfinterval; i <= endOfinterval; i++) {
            if (i %2 ==0) {
                SumEvenNamber += i;
            }else {
                SumOddNumber += i;
            }
        }
        System.out.println(SumEvenNamber);
        System.out.println(SumOddNumber);


//        Wypisz wszystkie liczby pierwsze z danego przedziału.
        System.out.println("Podaj początek przedziału");
        int startOfinterval1 = scanner.nextInt();
        System.out.println("Podaj koniec przedziału");
        int endOfinterval1 = scanner.nextInt();
        boolean PrimmeNumber = true;
        for (int i = startOfinterval1; i <= endOfinterval1; i++) {
            if (i < 2) {
                PrimmeNumber = false;
            }
            if (i == 2) {
                PrimmeNumber = true;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimmeNumber = false;
                    break;
                }else {
                    PrimmeNumber = true;
                }
            }
            if (PrimmeNumber) {
                System.out.println(i);
            }
        }
//        Oblicz A^B (A do potęgi B) bez korzystania z metody Math.pow().
        int a = 6;
        int potega = 4;
        int c = 1;


        for (int i = 1 ; i<=potega; i++){
            c *= a;
        }
        System.out.println(c);





    }

}