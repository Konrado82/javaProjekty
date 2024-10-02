package pl.KonradTysper.spring_boot_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    private final DataBaseConnection dataBaseConnection;
    @Autowired
    public Userservice(DataBaseConnection dataBaseConnection){
        this.dataBaseConnection=dataBaseConnection;
    }
    public void registerUser(String username){
        dataBaseConnection.addUserToDatabase(username);
    }
 }
