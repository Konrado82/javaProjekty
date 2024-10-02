package org.example;

import org.example.drive.Drive;
import org.example.drive.HDDDrive;
import org.example.file.File;
import org.example.file.image.GIFemageFile;
import org.example.file.image.JPGImagefun;
import org.example.file.music.Mp3file;
import org.example.usbdivice.Mause;
import org.example.usbdivice.Memorystick;
import org.example.usbdivice.USBDivice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Monitor monitor = new Monitor("Dell");
//        System.out.println(monitor.getRosolution());
//
//        monitor.setLowResolutiion();
//
//        System.out.println(monitor.getRosolution());
//        Drive hddDrive = new HDDDrive();
//        Computer computer = new Computer(monitor, hddDrive);
//        hddDrive.addFile(new File("p.jpg"));
//        hddDrive.listFiles();
//        computer.addFile(new File("p.jpg"));
//        computer.listFile();
//        Mause mause = new Mause("Mysz");
//        Memorystick memorystick = new Memorystick("Pendrive");
//
//        computer.addUSBDivice(mause);
//        computer.addUSBDivice(memorystick);

//        List<USBDivice> usbDivices = computer.getUsbDivices();
//        for (USBDivice divice : usbDivices){
//            System.out.println(divice.getName());
//        }
        Mp3file mp3file = new Mp3file("aaa", 500, "Panasnic", "As", 200);
        JPGImagefun jpgImagefun = new JPGImagefun("Alice", 500, 50);
        GIFemageFile giFemageFile = new GIFemageFile("Bra", 500);

        Monitor monitor = new Monitor("Dell");
        Drive hddDrive = new HDDDrive();
        Computer computer = new Computer(monitor, hddDrive);

        computer.addFile(mp3file);
        computer.addFile(jpgImagefun);
        computer.addFile(giFemageFile);

        computer.listFile();
        File file= computer.findFile("aaa");
        System.out.println(file.getsize());
        System.out.println(file);




    }
}