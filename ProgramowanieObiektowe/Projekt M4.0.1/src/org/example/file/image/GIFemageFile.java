package org.example.file.image;



public class GIFemageFile extends AbstractImageFile {



    public GIFemageFile(String name, int size) {
        super(name,size);
    }

    public void animation(){
        System.out.println("shwing funny GIF");
    }


}
