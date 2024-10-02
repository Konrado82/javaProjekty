package pl.konradTysper;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.*;

public class Main {


    //    private final static Map<String,String>countiersAndCapitals=new HashMap<>();


    //    private final static BiMap<String, String> countiersAndCapitals = HashBiMap.create();
//
    public static void main(String[] args) {
        //ZADANIE JOIN STRING

//        List<String> names = new ArrayList<>();
//        names.add("Mariusz");
//        names.add("Kuba");
//        names.add(null);
//        String joined = String.join("; ", names);
//        String joined2 = Joiner.on("; ").skipNulls().join(names);
//        String joined3 = Joiner.on("; ").useForNull("Domyslny").join(names);
        //ZASANIE SPLIT STRING

        String longtext= ",mmmm, kashdfu,   , ,h8ehi,";
        String[] split1 = longtext.split(";");
        List<String>names=Arrays.asList(split1);
        System.out.println(names);

        List<String>names2= Splitter.on(";")
                .trimResults()
                .omitEmptyStrings()
                .splitToList(longtext);
        System.out.println(names2);



        //ZADANNIE BIMAP- u góry Bimapa(zamiana haszmapy na bimap)

//        countiersAndCapitals.put("Polska", "Warszawa");
//        countiersAndCapitals.put("NIemcy", "Berlin");
//        countiersAndCapitals.put("Francja", "Paryż");
////        String capitalF = countiersAndCapitals.get("Francja");
////        System.out.println(capitalF);
////        System.out.println(getCounry("Paryż"));
//        System.out.println(countiersAndCapitals.inverse().get("Berlin"));
//
//    }
        //KONIEC ZADANIA BIMAP, poniżej tradycyjna wersja

//    private static String getCounry(String capital) {
//        Set<String> countries = countiersAndCapitals.keySet();
//        for (String country: countries){
//            if (capital.equals(countiersAndCapitals.get(country))){
//                return country;
//            }
//        }
//        return null;

    }
}



