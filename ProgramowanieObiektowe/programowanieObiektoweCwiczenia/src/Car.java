public class Car  {

    private final String brand;
    private final String model;
    private final int year;
    private String color;
    private int mileage;
    private final int maxSpeed;
    private int range;
    private final int maxRange;



    public Car (String brand, String model, int year, String color, int maxSpeed, int range){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;

        this.maxSpeed = maxSpeed;
        this.range = range;
        this.maxRange=range;
    }
    public Car (String brand, String model, String color, int maxSpeed, int range, int maxRange){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.maxRange = range;
        this.year=2024;

    }
    public  void printCarInformation() {
        System.out.println("Marka " + brand);
        System.out.println("Model " + model);
        System.out.println("Rok " + year);
        System.out.println("Kolor " + color);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void drive(int distance) {
        if (range - distance >= 0) {
            mileage += distance;
            range -= distance;

        } else {
            System.out.println("Uzupełnij benzynę");
        }
    }
        public void addFuel () {
            range = maxRange;
        }

        public int getMileage () {
            return mileage;
        }

        public int getMaxSpeed () {
            return maxSpeed;
        }

        public int getRange () {
            return range;
        }
    }

