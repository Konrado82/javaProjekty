import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints=0;
        System.out.println("Jak nazywa się największe jezioro w Polsce?" +
                " A- Mamry" +
                " B- Śniardwy" +
                " C- Dąbie");
        String anw1 = scanner.nextLine();
        if (anw1.equals("B")){
            System.out.println("Brawo");
            numberOfPoints+=1;
        }else System.out.println("złą odpowiedź");

        System.out.println("Jak nazywa się najgłłębsze jezioro w Polsce?" +
                " A- Mamry" +
                " B- Miedwie" +
                " C- Dąbie");
        String anw2 = scanner.nextLine();

        if (anw2.equals("A")){
            System.out.println("Brawo");
            numberOfPoints+=1;
        }else System.out.println("złą odpowiedź");

        System.out.println("Które jezioro ma połączenie z morzem?" +
                " A- Miedwie" +
                " B- Dąbie" +
                " C- Charzykowe");
        String anw3 = scanner.nextLine();

        if (anw3.equals("B")){
            System.out.println("Brawo");
            numberOfPoints+=1;
        }else System.out.println("złą odpowiedź");

        System.out.println("Twoja liczba punktów to: "+ numberOfPoints);


    }
}