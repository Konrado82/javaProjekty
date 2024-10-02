package org.example.usbdivice;

public class Mause implements USBDivice {

    private final String name;

    public Mause(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("connected");
        return true;
    }

    @Override
    public boolean disconect() {
        System.out.println("disconected");
        return true;

    }

    @Override
    public String getName() {
        return name;
    }
}
