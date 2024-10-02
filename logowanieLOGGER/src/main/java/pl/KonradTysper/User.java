package pl.KonradTysper;

public class User {
    String name;
    String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void capitalizeName(){
        name= name.toUpperCase();

    }
    public void capitalizeLastName(){
        lastName= lastName.toUpperCase();
    }
    public  boolean isMale(){
        return !name.startsWith("a");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
