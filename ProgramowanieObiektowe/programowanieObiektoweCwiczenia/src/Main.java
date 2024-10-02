import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jakiej marki samochód chcesz stworzyć");
        String brand = scanner.nextLine();
        System.out.println("Jaki chcesz model?");
        String model = scanner.nextLine();
        System.out.println("Jaki ma mieć kolor?");
        String color = scanner.nextLine();
        System.out.println("Z którego roku ma być?");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Jaką ma mieć maksymalną prędkosć?");
        int maxSpeed = Integer.parseInt(scanner.nextLine());
        System.out.println("Jaki ma mieć zasię?");
        int range = Integer.parseInt(scanner.nextLine());

        Car car = new Car(brand, model, color, year, maxSpeed, range);

        System.out.println();
        System.out.println("Utworzyłes następujący samochód: ");
        System.out.println("Marka"+ car.getBrand());
        System.out.println("MOdel: "+ car.getModel());
        System.out.println("Kolor "+ car.getColor());
        System.out.println("Rok: "+ car.getColor());
        System.out.println("Prędkosc max: "+ car.getMaxSpeed());
        System.out.println("Zasięg: "+ car.getRange()+"km");

        System.out.println();

        while (true){
            System.out.println("Wybierz opcje: ");
            System.out.println("1: jedż");
            System.out.println("2: uzupełnij benzynę");
            System.out.println("3. zakończ");

            int userChoice= Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Ile km chcesz jechać");
                    int distance = Integer.parseInt(scanner.nextLine());
                    car.drive(distance);

                }
                case 2 -> car.addFuel();


                case 3 -> System.exit(0);
            }



                System.out.println();
                System.out.println("Przebieg: "+ car.getMileage());
                System.out.println("Pozostały zsięg: "+ car.getRange());




            }
        }




    }


    







