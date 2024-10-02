import javax.security.sasl.SaslClient;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę kroków");
        double numberOfSteps = scanner.nextInt();
        double oneStep=0.45;

        double meters = (numberOfSteps*oneStep);
        double kilometers= ((numberOfSteps*oneStep)/100);
        BigDecimal kilometers1 = new BigDecimal(kilometers).setScale(2, RoundingMode.HALF_UP);

        System.out.println("PrzeszedłeŚ "+meters+ " metrów ,co jest równe "+kilometers1
         +" kilometra");

    }
}