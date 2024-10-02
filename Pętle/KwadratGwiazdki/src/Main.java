public class Main {
    public static void main(String[] args) {

            int x = 3;
            int y = 20;

            for (int i = 1; i <= x; i++) {
                for (int j = 0; j < y; j++)
                    System.out.print("*");
                System.out.println();
            }

            for (int i = 1; i <= x ; i++) {
                for (int j = 0; j < 2; j++)
                    System.out.print("*");
                for (int j = 0; j < y - 4; j++)
                    System.out.print("o");
                for (int j = 0; j < 2; j++)
                    System.out.print("*");
                System.out.println();
            }

            for (int i = 1; i <= x; i++) {
                for (int j = 0; j < y; j++)
                    System.out.print("*");
                System.out.println();
            }


//
//
//        for (int i = 0; i < x; i++)
//            System.out.print("*");
//        System.out.println();
//


        }
}