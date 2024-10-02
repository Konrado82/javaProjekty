//Narysuj piramidę dla podanej liczby wierszy:

public class Main {
    public static void main(String[] args) {
        class Scratch {
            public static void main(String[] args) {
                int len = 10;

                for (int i = len; i > 0; i--) {
                    for (int j = i; j > 0; j--)
                        System.out.print(" ");
                    for (int k = 2 * (len - i) + 1; k > 0; k--)
                        System.out.print("*");
                    System.out.println();


//       for (int i = 1; i <=10; i++ ){
//           for (int j = 0; j < i; j++)
//               System.out.print("*");
//           System.out.println();
//       }
                }
            }
        }

    }
}