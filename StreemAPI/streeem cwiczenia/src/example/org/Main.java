package example.org;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = prepareData();

        //1wyswietl imiona uzytkowników ktorzy znają jave

//        users.stream()
//                .filter(user -> user.skills().contains("Java"))
//                .map(User::name)
//                .forEach(System.out::println);

        //2.wyswietl imiona i wiek nieaktywnych użytkowników

//        users.stream()
//                .filter(user -> !user.isActive())
//                .map(User-> User.name()+","+ User.age())
//                .forEach(System.out::println);

        //Znajdz uzytkowników ktorzy znają co najmniej 3 języki. Wyswietl tych uzytkownikow i jezyki

//        users.stream()
//                .filter(user -> user.skills().size()>=3)
//                .map(user-> user.name()+String.join(",", user.skills()))
//                .forEach(System.out::println);

        //znajdz uzytkownika ktory zna najwięcej ttechnologii, wyswietl imie i liste technologii

//        Optional<User> mostSkills = users.stream()
//                .max(Comparator.comparing(user -> user.skills().size()));
//        System.out.println(mostSkills.get().name()+ String.join(":", mostSkills.get().skills()));


        //sredni wiek aktywnych uzytkowników aktywnych uzyt.

//        Double collect1 = users.stream()
//                .filter(User::isActive)
////                .mapToInt(User::age)
////                .average()
//                .collect(Collectors.averagingDouble(User::age));
//
//        System.out.println(collect1);



        //ile srednio technologii zna uzytkownikk

//        OptionalDouble average =
        Double collect1 = users.stream()
                .collect(Collectors.averagingDouble(user -> user.skills().size()));
//                .mapToInt(user -> user.skills().size())
//                .average();
//        System.out.println(average.getAsDouble());
        System.out.println(collect1);

        //podziel uzytkownikow na tych co znają jav e i tych ktorzy nie znają, wyswietl imiona i tech
        //uzytkowników obu grup

        Map<Boolean, List<User>> usersMap = users.stream()
                .collect(Collectors.partitioningBy(user -> user.skills().contains("Java")));

        usersMap.get(true).stream()
                .map(user -> user.name()+":"+String.join(",",user.skills()))
                .forEach(System.out::println);

        System.out.println("nowa");

        usersMap.get(false).stream()
                .map(user -> user.name()+":"+String.join(",",user.skills()))
                .forEach(System.out::println);

        //sprawdx czy wszyscy mają wiecej niz 18 lat

        boolean adults = users.stream()
                .allMatch(user -> user.age() > 18);
        System.out.println(adults);

        //sprwdz czy istnieje uzyt który ma 40 lub więcej lat

        boolean abovefortry = users.stream()
                .anyMatch(user -> user.age() >= 40);
        System.out.println(abovefortry);

        //znajdz najstarszego  ktory zna jave

        Optional<User> oldest = users.stream()
                .filter(user -> user.skills().contains("Java"))
                .max(Comparator.comparing(user -> user.age()));
        System.out.println(oldest.get().name()+","+oldest.get().age());

        //znajdx uzytkownikow ktorych technologie zaczynają sie na litere C.
        //wyswietl imiona i technologie tych uzytkownikow

        users.stream()
                .filter(user -> user.skills().stream().anyMatch(skill->skill.startsWith("C")))
                .map(user -> user.name()+":"+String.join(",", user.skills()))
                .forEach(System.out::println);

        //mapa, klucz imie vartosc ilosc znanych technologii

        Map<String, Integer> collect = users.stream()
                .collect(Collectors.toMap(
                        User::name,
                        user -> user.skills().size()
                ));
        System.out.println(collect.get("Kamil"));

        //wybierz słowa palisndromy

        List<String> words = List.of("kajak", "oko", "komputer", "ala", "java");
//        words.stream()
//                .filter(word-> word.contentEquals(new StringBuilder(word).reverse()))
//                .forEach(System.out::println);

        //wyswietl słowa z listy,oddziel przecinkiem, zrób duze litery

        String allWordsd = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(allWordsd);

        //znajdz najmniejsza liczbe parzysta

        List<Integer> list1 = List.of(62, 55, 120, 17, 7, 11);
        List<Integer> list2 = List.of(42, 27, 35, 98);
        Integer integer = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .filter(a -> a % 2 == 0)
                .findFirst()
                .get();
        System.out.println(integer);


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