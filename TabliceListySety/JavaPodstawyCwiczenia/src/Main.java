public class Main {
    public static void main(String[] args) {
        String a = " Jak nauczyć się programowania   ";
        a = a.toUpperCase().strip().substring(4);
        System.out.println(a);
//
        int lenght = a.length();
        System.out.println(lenght);
//
        String replace = a.replace(" ", "%");
        System.out.println(replace);
//
        boolean aletter = a.endsWith("A");
        System.out.println(aletter);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imie?");
//        String name = scanner.nextLine();
//        System.out.println("nazwisko?");
//        String surname = scanner.nextLine();
//        System.out.println("ile lat?");
//        int old = scanner.nextInt();
//
//        System.out.println("Imie: " + name);
//        System.out.println("Nazwisko: " + surname);
//        System.out.println("LAt: " + old);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbę");
//        int a = scanner.nextInt();
//        System.out.println("Podaj drugą liczbę");
//        int b = scanner.nextInt();
//
//        System.out.println("Wynik dodawania to "+(a+b));

//

//        System.out.println("Podaj rok");
//        int year = scanner.nextInt();
//
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
//            System.out.println("Rok przestępny");
//        }else {
//            System.out.println("To nie rok przestępny");
//        }



//        poukładaj w kolejności od największej
//        int a = 10;
//        int b = 8;
//        int c = 90;

//        if (a > b ) {
//            if (a > c) {
//                System.out.println(a);
//            } else {
//                System.out.println(c);
//            }
//
//        }else {
//            System.out.println(b);
//        }

//        if (a < b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        if (b < c){
//            int temp = b;
//            b = c;
//            c = temp;
//        }
//        if (a < b){
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbę");
//        int number1 = scanner.nextInt();
//        int number1 = Integer.parseInt(scanner.nextLine());
//        scanner.nextLine();
//        System.out.println("Podaj drugą liczbą");
//        int number2 = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Podaj operację");
//        String operation = scanner.nextLine();
//
//        if (operation.equals("dodawanie")){
//            System.out.println((number1 + number2));
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj swój wynik w pinktach");
//        int score = scanner.nextInt();
//
//        if (score >= 90 && score <= 100) {
//            System.out.println("Masz 5");
//        } else if (score >= 80 && score < 90) {
//            System.out.println("Masz 4");
//        } else if (score >= 70 && score < 80) {
//            System.out.println("Masz 3");
//        } else if (score >= 60 && score < 70) {
//            System.out.println("Masz 2");
//        } else if (score >= 0 && score < 60) {
//            System.out.println("MAsz 1");
//        } else
//            System.out.println("Podaj w zakresie 0-100");


//        int a = 40;
//        int b = 30;
//        int c = 20;
//
//
//        if (a < b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        if (b < c) {
//            int temp = b;
//            b = c;
//            c = temp;
//        }
//        if (a < b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//

//
//        int largest = a;
//        if (b > largest) {
//            largest = b;
//            }
//        if (c > largest) {
//            largest = c;
//        }
//        System.out.println(largest);



//       int year = 2100
//               ;
//
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println(" To rok przestępny");
//        } else {
//            System.out.println("To nie jest rok przestępny");
//        }


    }
}