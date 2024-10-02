import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double a = 7.25;
        double b = 2.58;

        double c = a / b;

        System.out.println(Math.round(c*100.0)/100.0); // pierwszy sposób na 2 miejsca po przec
        System.out.println(Math.round(c)); // zaokrągla nie liczba double
        System.out.println(Math.ceil(c)); // zaokrągla do góry liczba double
        System.out.println(Math.floor(c)); // do dołu

        BigDecimal roundednumber = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);

        System.out.println(roundednumber.doubleValue()); // 2 sposób

        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        System.out.println(decimalFormat.format(c)); //3 sposób

        String formattedNum = String.format("%.2f", c); //4 sposób

        System.out.println(formattedNum);
    }
}