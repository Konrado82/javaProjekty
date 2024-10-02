package org.example;

public class User {
    String name;
    int age;
    boolean isActive;
    String email;boolean

    public User() {}

    public User(String name, int age ){
        this.name = name;
        this.age = age;
        this.isActive=true;
    }

    public User(String  name, int age, boolean isActive,String email){
        this(name,age);
        this.isActive= true;
        this.email= email;
    }

    public  User(String name){
        this.name=name;
        this.isActive=true;
    }
    public  void printUserInformation(){
        System.out.println("Imię" + name);
        System.out.println("Wiek"+ age);
        System.out.println("Czy aktywny"+ isActive);
        System.out.println("Czy może kupować"+ canBuy());
    }

    public void hello (){
        System.out.println("Hello");
    }
    public boolean canBuy(){
        return this.age >= 18;
    }
    public void sendEmail(String body){
        System.out.println("Wysyłam mail o tresci " +body+ " na adres " + this.email);


    }

}
