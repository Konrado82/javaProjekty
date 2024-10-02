package org.example.usbdivice;

public class Memorystick implements USBDivice{

    private final String name;
    private boolean ejected = false;

    public Memorystick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Memorystick connected");
        return true;
    }

    @Override
    public boolean disconect() {
        if (ejected){
            System.out.println("Memeory stick disconecket");
            return true;
        }else {
            System.out.println("Please ejeck memery stick");
            return false;
        }
    }
    public void ejeckt(){
        System.out.println("ejected memory stick");
        ejected = true;

    }

    @Override
    public String getName() {
        return name;
    }
}
