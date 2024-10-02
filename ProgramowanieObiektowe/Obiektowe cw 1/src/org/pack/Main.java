package org.pack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Calkulator calkulator1 = new Calkulator();
//
//        System.out.println(calkulator1.add(12,8));
//        System.out.println(calkulator1.add(12,5.7));

        List<String> text4 = new ArrayList<>();
        StringConcentator stringConcentator = new StringConcentator();

        String nowytext = stringConcentator.connectString("jeden ", "dwa");
        System.out.println(nowytext);

        String nowytekst3 = stringConcentator.connectString("jeden ", "dwa ", "trzy");
        System.out.println(nowytekst3);

        text4.add("jeden ");
        text4.add("dwa ");
        text4.add("trzy ");
        text4.add("cztery ");

        for (int i=0; i<4; i++){
            nowytext = stringConcentator.connectString("zero ", text4);
        }
        System.out.println(nowytext);




    }


}