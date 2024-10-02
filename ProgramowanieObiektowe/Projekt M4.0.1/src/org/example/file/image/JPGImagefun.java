package org.example.file.image;



public class JPGImagefun extends AbstractImageFile {


    private final int compressin;


    public JPGImagefun(String name, int size, int compressin) {
        super(name, size);
        this.compressin = compressin;
    }

    public int getCompressin() {
        return compressin;
    }


    public void showimage() {
        System.out.println("showing image");
    }

}




