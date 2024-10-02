import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rect rect = new Rect(1,1);
        Rect rect5 = new Rect(1,1);
        Rect rect1 = new Rect(2.5,2.0);
        Rect rect4 = new Rect(2.0,2.5);
        Rect rect2 = new Rect(2.0);
        Rect rect3 = new Rect(3);

        System.out.println(rect.isSquare());
        System.out.println(rect1.isSquare());
        System.out.println(rect2.isSquare());
        System.out.println(rect3.isSquare());
        System.out.println();
        System.out.println(rect.equals(rect5));
        System.out.println(rect1.equals(rect4));


    }
}






//        Rectangle rectangle = new Rectangle(2.0, 2.5);
//        TriangleT triangleT = new TriangleT(2.0,5.0);
//        Circle circle = new Circle(2.5);
//        System.out.println(rectangle.calkulateArea());
//        System.out.println(rectangle.getType());
//        System.out.println(triangleT.getType());
//        System.out.println(triangleT.calkulateArea());
//        System.out.println(circle.getType());
//        System.out.println(circle.calkulateArea());





//        System.out.println("Podaj miesiąc drukowanymi literami");
//        String monthAnsw = scanner.nextLine();
//        Months[] months = Months.values();
//
//        if (monthAnsw.equals("LUTY")) {
//            System.out.println(Months.LUTY.getDaysIntMonths());
//
//        } else if (monthAnsw.equals("KWIECIEŃ")|| monthAnsw.equals("CZERWIEC")||monthAnsw.equals("WRZESIEŃ")||monthAnsw.equals("LIstopad")) {
//            System.out.println(Months.KWIECIEŃ.getDaysIntMonths());
//        }else {
//            System.out.println(Months.MAJ.getDaysIntMonths());
//        }






//        List<String> stringList1 = new ArrayList<>();
//
//
//        Calkulator calkulator1 = new Calkulator();
//        System.out.println(calkulator1.addNumbers(15.2,7.8));
//        StringConcentrator stringConcentrator = new StringConcentrator();
//        System.out.println(stringConcentrator.concentrate("mama","tata","ja"));
//
//
//        stringList1.add("mama");
//        stringList1.add("tata");
//        stringList1.add("bocian");
//        stringList1.add("ja");
//        stringList1.add("brat");
//
//        System.out.println(stringConcentrator.concentrate("my",stringList1));




