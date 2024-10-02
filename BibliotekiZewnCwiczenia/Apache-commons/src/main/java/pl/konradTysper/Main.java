package pl.konradTysper;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.WordUtils;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Jak masz na imię?");
//        String name = scanner.nextLine();

//        System.out.println("Czesc, mam na imię"+ name+"!");

//        String template="Czesć ${name}!";
//        StringSubstitutor subsitutor = new StringSubstitutor(Map.of("name", name));
//        String replaced = subsitutor.replace(template);
//
//        System.out.println(replaced);

        // drugie zad
//        String text="programuj od podstaw";
//        String capitalized = StringUtils.capitalize(text);
//        String capitalized1 = WordUtils.capitalize(text);
//        System.out.println(capitalized1);
//        System.out.println(capitalized);
        //koniec2zad
        //zad 3
        String name = StringUtils.defaultString(Getname(), "ziom");
        System.out.println("Czesć "+ name.toUpperCase()+"!");


        //koniec zad 3



    }
    private static String Getname(){
        return null;
    }
}