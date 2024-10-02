package pl.KonradTysper.webservice;

import com.google.gson.Gson;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class UserControler {
    public UserControler() throws FileNotFoundException {
    }
    @GetMapping("users")

    public ResponseEntity <List<User>> getAllUsers() throws IOException {//najpierws Public List<Users>
        //UPRASZCZAMY  zamieast <String> List<Users>
        List<User> users = getUsersFromFile();
//        Gson gson = new Gson();//UPRASZCZANIE :USUWAMY
//        String usersJson = gson.toJson(users);//USUWAMY
        return ResponseEntity.ok(users);
//                .status(HttpStatus.OK)
//                .header("Content-Type", "aplication/json;charset=UTF-8")
//                .body(responseUser);//UPRASZCZAMY- zostawiamy .body(users)+ zamieniamy liste stringów na listę Userów u góry
        //UPROSZCZENIE 2 zostawiamy tylko return ResponseEntity.ok(users)


    }

    @GetMapping("users/{id}")

    public ResponseEntity<User> getAllUsers(@PathVariable int id) throws IOException {//najpierws Public List<Users>
        //UPRASZCZAMY  zamieast <String> List<Users>
        List<User> users = getUsersFromFile();
        User responseUser=null;
        for (User user:users){
            if (user.id()==id){
                responseUser=user;
            }
        }
//        Gson gson = new Gson();//UPRASZCZANIE :USUWAMY
//        String usersJson = gson.toJson(users);//USUWAMY
        return ResponseEntity.ok(responseUser);
//                .status(HttpStatus.OK)
//                .header("Content-Type", "aplication/json;charset=UTF-8")
//                .body(responseUser);//UPRASZCZAMY- zostawiamy .body(users)+ zamieniamy liste stringów na listę Userów u góry
        //UPROSZCZENIE 2 zostawiamy tylko return ResponseEntity.ok(users)


    }



    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody User user) throws IOException {
        List<User> users = getUsersFromFile();
        int lastId = users.getLast().id();
        CSVFormat csvFormat = getCSVFormat(true);

        User newUser = new User(lastId + 1, user.name(), user.age(), user.isMale());


        try (CSVPrinter printer = new CSVPrinter(new FileWriter("src/main/resources/users.csv", true),csvFormat)){
            printer.printRecord(newUser.id(),newUser.name(),newUser.age(),newUser.isMale());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);


    }
    @PutMapping("users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) throws IOException {
        List<User> usersFromFile = getUsersFromFile();

        ArrayList<User> newUsers = new ArrayList<>();//lista do której będziemy przypisywali tych ktorych nie chcemy updatować
        User updatedUser=null;

        for (User userFromfile: usersFromFile){
            if (userFromfile.id()== id){
                updatedUser = new User(id, user.name(), user.age(), user.isMale());
                newUsers.add(updatedUser);
            }else {
                newUsers.add(userFromfile);
            }
        }
        CSVFormat csvFormat = getCSVFormat(false);

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("src/main/resources/users.csv"),csvFormat)){
            for (User newUser:newUsers){
                printer.printRecord(newUser.id(),newUser.name(),newUser.age(),newUser.isMale());
            }

        }
        return ResponseEntity.ok(updatedUser);
    }
    @DeleteMapping("users{id}")
    public ResponseEntity<Void>delateUser(@PathVariable int id) throws IOException {
        List<User> usersFromFile = getUsersFromFile();

        ArrayList<User> users = new ArrayList<>(usersFromFile);
        users.removeIf(user -> user.id()==id);

        CSVFormat csvFormat = getCSVFormat(false);

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("src/main/resources/users.csv"),csvFormat)){
            for (User user:users){
                printer.printRecord(user.id(),user.name(),user.age(),user.isMale());
            }

        }return ResponseEntity.noContent().build();


    }





    private List<User> getUsersFromFile() throws IOException {
        Reader input = new FileReader("src/main/resources/users.csv");

        CSVFormat csvFormat = getCSVFormat(true);

        CSVParser parser = csvFormat.parse(input);
        List<User> users = parser.stream()//najpierw parser.streem
                .map(record -> {
                    int id= Integer.parseInt(record.get("id"));
                    String name = record.get("name");
                    int age = Integer.parseInt(record.get("age"));
                    boolean isMale = Boolean.parseBoolean(record.get("isMale"));

                    return new User(id,name, age, isMale);

                })
                .sorted(Comparator.comparing(User::id))
                .toList();
        return users;
    }

    private CSVFormat getCSVFormat(boolean setSkipHeaderRecord) {//wczesnie static CSVFormat
        return CSVFormat.DEFAULT.builder()//wczesnie CSVFORMAT csvformat
                .setHeader("id","name", "age", "isMale")
                .setSkipHeaderRecord(true)
                .build();
    }
}
