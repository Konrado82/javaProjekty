package org.example;

import org.example.drive.Drive;
import org.example.file.File;
import org.example.usbdivice.USBDivice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    List<USBDivice> usbDivices=  new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }
    public void addFile(File file){
        drive.addFile(file);

    }
    public  void listFile(){
        drive.listFiles();
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDivice> getUsbDivices() {
        return usbDivices;
    }
    public void addUSBDivice(USBDivice usbDivice){
        boolean isConnected = usbDivice.connect();
        if (isConnected){
            usbDivices.add(usbDivice);

        }


    }
    public  void removeUSBdivice(USBDivice usbDivice){
        boolean disconect = usbDivice.disconect();
        if (!disconect){
            System.out.println("USB forsfully disconected");
        }
        usbDivices.remove(usbDivice);
    }
    public File findFile(String fileName){
        return drive.findFile(fileName);
    }
}
