public class Rectangle implements Shape{

    double a;
    double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return "Prostokąt";
    }

    @Override
    public double calkulateArea() {
        return (a*b);
    }

    }



