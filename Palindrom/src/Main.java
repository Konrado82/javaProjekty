public class Main {
    public static void main(String[] args) {
        String text = "kayak";

        char[] letters = text.toCharArray();
        char[] revLetters = new char[letters.length];

        for (int i =0; i<letters.length;i++){
            revLetters[i]= letters[letters.length-1-i];
        }
        boolean isPalindrom = true;

        for (int i =0; i<letters.length;i++ ){
            if (letters[i] != revLetters[i]){
                isPalindrom=false;
                break;
            }

        }

        if (isPalindrom){
            System.out.println("To palindrom");
        }
//        StringBuilder palindrom = new StringBuilder(text);
//        palindrom.reverse();
//
//
//        if (text.equals(palindrom.toString())){
//            System.out.println("to jest palindrom");
//        }else {
//            System.out.println("to nie jest palindom");
//        }
    }
}