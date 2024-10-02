import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoChronology;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/comments.txt");
        List<String> lines = Files.readAllLines(path);

        List<User> users = lines.stream()
                .map(line -> line.split(";"))
                .map(l -> new User(l[0], l[1], LocalDate.parse(l[2]), Integer.parseInt(l[3])))
                .toList();

//        Wyświetl komentarze w kolejności chronologiczne
//        users.stream()
//                .sorted(Comparator.comparing(User::date))
//                .map(User::comment)
//                .forEach(System.out::println);

//        Wyświetl tylko te komentarze, które mają więcej niż 10 polubień
//        users.stream()
//                .takeWhile(user -> user.likes()>10)
//                .map(User::comment)
//                .forEach(System.out::println);
//        Znajdź najdłuższy oraz najkrótszy komentarz

//        Optional<User> max = users.stream()
//                .max(Comparator.comparing(user -> user.comment().length()));
//        System.out.println(max);

//        Oblicz średnią liczbę polubień dla wszystkich komentarzy.
//        Double collect = users.stream()
//                .collect(Collectors.averagingInt(User::likes));
//        System.out.println(collect);

//        Oblicz ile komentarzy zostało dodanych przez mężczyzn i kobiety.

//        Map<Boolean, List<User>> MenAndWomen = users.stream()
//                .collect(Collectors.partitioningBy(user -> user.name().endsWith("a")));
//        long count = MenAndWomen.get(true).stream()
//                .count();
//        System.out.println(count);

//        Oblicz łączną liczbę polubień dla wszystkich komentarzy.

//        long sum = users.stream()
//                .collect(Collectors.summarizingInt(User::likes))
//                .getSum();
//        System.out.println(sum);

//        Znajdź wszystkich użytkowników, którzy zostawili komentarze o długości przekraczającej 50 znaków

//        users.stream()
//                .filter(user -> user.comment().length()>50)
//                .forEach(System.out::println);

//        Posortuj komentarze według liczby polubień w kolejności malejącej.
//        users.stream()
//                .sorted(Comparator.comparing(User::likes).reversed())
//                .map(User::comment)
//                .forEach(System.out::println);


//        Wyświetl komentarze dodane w październiku 2023

//        users.stream()
//                .filter(user -> user.date().getMonth().equals(Month.OCTOBER))
//                .map(User::comment)
//                .forEach(System.out::println);
//
//        Wyświetl unikalne daty, w których zostawiono komentarze

//        List<LocalDate> uniqeDates = new ArrayList<>();
//
////
//        List<LocalDate>dates = users.stream()
//                .map(User::date)
//                .toList();
//
//        for (LocalDate date:dates){
//        long count = users.stream()
//                .filter(user -> user.date().equals(date))
//                .count();
//        if(count==1){
//            uniqeDates.add(date);
//        }
//        }
//        List<LocalDate> finishList = uniqeDates.stream()
//                .sorted()
//                .toList();
//        System.out.println(finishList);
//
//        Oblicz sumę polubień dla komentarzy zostawionych w listopadzie 2023.


//        long sum = users.stream()
//                .filter(user -> user.date().getMonth().equals(Month.NOVEMBER))
//                .collect(Collectors.summarizingInt(User::likes)).getSum();
//        System.out.println(sum);
//
//        Wyświetl wszystkie unikalne imiona użytkowników.

//        Oblicz średnią długość komentarzy.

//        OptionalDouble average = users.stream()
//                .mapToInt(user -> user.comment().length())
//                .average();

//        Oblicz średnią liczbę słów na komentarz.

//        List<Long>wordsSummuryOnComment=new ArrayList<>();
//
//        List<String> commentList = users.stream()
//                .map(User::comment)
//                .toList();
//
//        for(String comment : commentList){
//            String[] splitedWords = comment.split(" ");
//            long wordsCounter = Arrays.stream(splitedWords).count();
//            wordsSummuryOnComment.add(wordsCounter);
//
//        }
//        Double finshAnswear = wordsSummuryOnComment.stream()
//                .collect(Collectors.averagingLong(Long::longValue));
//        System.out.println(finshAnswear);

//        Wyświetl komentarze, które zawierają przynajmniej jedno słowo zaczynające się na literę "s".

//        users.stream()
//                .filter(user -> {
//                    String[] words = user.comment().split(" ");
//                    return Arrays.stream(words).anyMatch(word -> word.startsWith("s"));
//                })
//                .map(User::comment)
//                .forEach(System.out::println);

//        Wyświetl komentarze użytkowników, których imiona zawierają literę "a" (bez względu na wielkość liter).
//        users.stream()
//                .filter(user -> user.name().toLowerCase().startsWith("a"))
//                .map(User::comment)
//                .forEach(System.out::println);

//        Posortuj komentarze według długości komentarza, a następnie wybierz 5 najdłuższych.
//        users.stream()
//                .map(User::comment)
//                .sorted(Comparator.comparing(String::length).reversed())
//                .limit(5)
//                .forEach(System.out::println);

//        Posortuj komentarze alfabetycznie według nazw użytkowników, a następnie wybierz 5 pierwszych komentarzy w alfabetycznym porządku

//        users.stream()
//                .sorted(Comparator.comparing(user -> user.name()))
//                .map(User::comment)
//                .sorted()
//                .limit(5)
//                .forEach(System.out::println);

//        Znajdź wszystkich użytkowników, którzy zostawili komentarze o długości przekraczającej średnią długość komentarzy.
//        double avarege = users.stream()
//                .mapToInt(user -> user.comment().length())
//                .average().getAsDouble();
//        users.stream()
//                .filter(user -> user.comment().length()> avarege)
//                .map(user -> user.name()+"-"+ user.comment())
//                .forEach(System.out::println);

//
//        Znajdź datę, w której zostawiono najwięcej komentarzy.

        HashMap<LocalDate, Long> objectHashMap = new HashMap<>();

        List<LocalDate> dates = users.stream()
                .map(User::date)
                .toList();
        for (LocalDate date:dates){
            long count = users.stream()
                    .filter(user -> user.date().equals(date))
                    .map(User::comment)
                    .count();
            objectHashMap.put(date,count);
        }
        Set<LocalDate> keys = objectHashMap.keySet();
        for (LocalDate key:keys){
            System.out.println(key+"-"+ objectHashMap.get(key));
        }



    }
}




