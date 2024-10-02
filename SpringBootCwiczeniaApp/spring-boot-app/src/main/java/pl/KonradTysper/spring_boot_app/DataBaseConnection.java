package pl.KonradTysper.spring_boot_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataBaseConnection {
    @Value("localhost")
    String host;
    @Value("Kamil")
    String username;
    @Value("tajnehaslo")
    String password;

    public void addUserToDatabase(String username){
        System.out.println("Użytkownik dodany do bazy");
    }
}
