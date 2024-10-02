import java.util.Objects;

public class Rect {
    int a;
    int b;
    double c;
    double d;

    public Rect(int a, int b) {
        if (b > a) {
            this.b = a;
            this.a = b;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    public Rect(double c, double d) {
        if (d > c) {
            this.d = c;
            this.c = d;
        } else {
            this.c = c;
            this.d = d;
        }
    }

    public Rect(int a) {
        this.a = a;
        this.b = a;
    }

    public Rect(double c) {
        this.c = c;
        this.d = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rect rect = (Rect) o;
        return a == rect.a && b == rect.b && Double.compare(c, rect.c) == 0 && Double.compare(d, rect.d) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }
    public boolean isSquare(){
        if ((a == b) && (c == d)) return true;
        return false;
    }

}




