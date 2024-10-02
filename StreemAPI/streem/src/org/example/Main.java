package org.example;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

//        boolean AnyMatchJava = users.stream()
//                .anyMatch(user -> user.skills().contains("Java"));
//        System.out.println(AnyMatchJava);
//
//        boolean golang = users.stream()
//                .noneMatch(user -> user.skills().contains("Golang"));
//        System.out.println(golang);
//
//        boolean javaAbowe18 = users.stream()
//                .allMatch(user -> user.age()>=18);
//        System.out.println(javaAbowe18);


//        List<String>names1= List.of("Karol","Kamil","Zbych");
//        List<String>names2= List.of("Karolina","Ala","Ami");
//
//        Stream.concat(names1.stream(), names2.stream())
//                .filter(name-> name.startsWith("K"))
//                .forEach(System.out::println);
//




//        Map<Boolean, List<User>> collect1 = users.stream()
//                .collect(Collectors.partitioningBy(User::isActice));
//
//        System.out.println(collect1);

//        Map<Integer, List<String>> collect = users.stream()
//                .map(User::name)
//                .collect(Collectors.groupingBy(String::length));//(name->name.length())
//
//        System.out.println(collect);


//        long numberOfElements = users.stream().count();
//        System.out.println(numberOfElements);
//
//        Integer SumOfAges = users.stream()
//                .collect(Collectors.summingInt(User::age));
//        System.out.println(SumOfAges);
//
//        Double AvAge = users.stream()
//                .collect(Collectors.averagingInt(User::age));
//        System.out.println(AvAge);
//
//        Optional<Integer> maxAge = users.stream()
//                .map(User::age)
//                .max(Comparator.naturalOrder());
//        System.out.println(maxAge.get());


//        Set<List<String>> skills = users.stream()
//                .sorted(Comparator.comparing(User::name))
//                .map(User::skills)
//                .collect(Collectors.toSet());



//        List<String> skills = users.stream()
//                .sorted(Comparator.comparing(User::name))
//                .map(User::skills)
//                .flatMap(Collection::stream)//list -> list.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .toList();
//
//        skills.forEach(System.out::println);



//        users.stream().forEach(System.out::println);
//        List<String> names = users.stream()
//                .filter(user -> !user.name().endsWith("a"))
//                .sorted(Comparator.comparing(User::age))
//                .map(User::name)// można tez (User-> user.name()+ user...)
//                .toList();

//        names.forEach(System.out::println);

        Stream<List<String>> listStream2 = users.stream()
                .sorted(Comparator.comparing(User::name))
                .map(User::skills);
        listStream2.forEach(System.out::println);


//                .takeWhile(user -> user.age()<35)
//                .dropWhile(user -> user.age()<35)
//
////                .limit(2)
////                .skip(1)
//                .forEach(user -> System.out.println(user.name()+","+ user.age()));



//        Country country = new Country("Poland", "Warsaw");
//        Country country1 = new Country("Germany", "Berlin");
//        Country country2 = new Country("Poland", "Cracow");
//
//        List<Country>countries=List.of(country,country1,country2);
//
//        Map<String, String> countrieAndCapital = countries.stream()
//                .collect(Collectors.toMap(Country::name, Country::capital,(oldValue, newValue)-> newValue));
//
//        System.out.println(countrieAndCapital.get("Poland"));







    }

    private static List<User> prepareData() {
        List<User> users = new ArrayList<>();
        users.add(new User("Kamil", 35, List.of("Java", "Python", "JavaSkript"), true));
        users.add(new User("Mariusz", 30, List.of("Java", "C++", "C#"), true));
        users.add(new User("Dominik", 20, List.of("Java", "Dart", "Python"), false));
        users.add(new User("Rafał", 40, List.of("C", "C++", "C#"), true));
        users.add(new User("Paulina", 31, List.of("Pytjon", "JavaSkript", "Rust"), true));
        users.add(new User("Kasia", 30, List.of("PHP", "Haskell"), false));
        users.add(new User("Asia", 25, List.of("Java", "Scala", "Kotlin", "Haskell", "Closure"), true));

        return users;
    }

    }






//        Zadanie2
//        List<String> names = List.of("Kamil", "Mariusz", "Dominik", "Paulina", "Kasia", "Asia");
//
//        names.stream()
//                .filter(name -> name.endsWith("a"))
//                .forEach(System.out::println);






//        ZADANIE 1
//        long femaleCount = names.stream()
//                .filter(name -> name.endsWith("a"))
//                .count();
//        System.out.println(femaleCount);


//            STARA METODA
//        int femaleCount=0;
//        for (String name: names){
//            if (name.endsWith("a")){
//                femaleCount++;
//            }
//            System.out.println(femaleCount);
//        }

