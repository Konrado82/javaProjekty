public class TriangleT implements Shape{

    double a;
    double h;

    public TriangleT(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getType() {
        return "trójkąt";
    }

    @Override
    public double calkulateArea() {
        return ((a*h)/2);
    }




    }



