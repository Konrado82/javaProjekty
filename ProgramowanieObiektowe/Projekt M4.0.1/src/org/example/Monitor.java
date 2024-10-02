package org.example;

public class Monitor {
    private final String name;
    private int wight;
    private int lenght;

    public Monitor(String name) {
        this.name = name;

        setHighResolution();
    }
    public void setHighResolution() {
        wight=3840;
        lenght=1920;
    }
    public void setLowResolutiion() {
        wight=920;
        lenght=800;
    }
    public String getRosolution(){
        return wight+ "x" + lenght;
    }





}
