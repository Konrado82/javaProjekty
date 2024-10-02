import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        random.nextInt(101);
        System.out.println("Zgadnij liczbę z przedziału 0-100");
        int number = scanner.nextInt();


        int randomNumber = random.nextInt(0,100);

        int proby=0;


        while (number!=randomNumber){
            if (number>randomNumber){
                System.out.println("podana liczba jest za duża, próbuj dalej");
            } else if (number<randomNumber) {
                System.out.println("podana liczba jest za mała, próbuj dalej");
            }
            number=scanner.nextInt();
            proby+=1;
        }
        System.out.println("Gratulacje odgadłes za "+proby+" razem");




//        for (int i =0;i==randomNumber;i++){
//
//            if (number<randomNumber) {
//                System.out.println("za mało, podaj kolejną liczbę");
//                number = scanner.nextInt();
//            } else {
//                System.out.println("za dużo, podaj kolejną liczbę");
//                number = scanner.nextInt();
//            }
//        }


    }
}