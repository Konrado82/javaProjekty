public class Car {
    String mark;
    String model;
    int year;
    String color;

    public Car(String mark, String model, int year, String color) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(String mark, String model, String color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.year=2023;
    }
    public void infoCar(){
        System.out.println("Marka: "+ this.mark);
        System.out.println("Model: "+ this.model);
        System.out.println("rok:"+ this.year);
        System.out.println("kolor: "+ this.color);
    }
}
