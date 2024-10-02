public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("opel", "op", "red");

        Car car2 = new Car("audi", "a2", 2020, "blue");
        car1.infoCar();
        System.out.println();
        car2.infoCar();
        car2.color="yel";
        System.out.println(car2.color);
    }

}