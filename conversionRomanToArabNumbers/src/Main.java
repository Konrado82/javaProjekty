import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String romanNumber="XIV";
        int result=0;
        int previueValue=0;

        HashMap<Character,Integer> mapOfNumbers = new HashMap<>();

            mapOfNumbers.put('I', 1);
            mapOfNumbers.put('V', 5);
            mapOfNumbers.put('X', 10);
            mapOfNumbers.put('L', 50);
            mapOfNumbers.put('C', 100);
            mapOfNumbers.put('D', 500);
            mapOfNumbers.put('M', 1000);

            for (int i = romanNumber.length()-1; i>=0; i--){
                int currentValue = mapOfNumbers.get(romanNumber.charAt(i));

                if (currentValue<previueValue){
                    result-=currentValue;
                }else {
                    result+=currentValue;
                }
                previueValue=currentValue;

            }
        System.out.println(result);





    }


}