public class Circle implements Shape{
    double r;
    String answ = null;


    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getType() {
        return answ="koło";
    }

    @Override
    public double calkulateArea() {
        double v = Math.PI * Math.pow(r,2);
        return v;

    }


}
