package org.example.file.image;

import org.example.file.AbstractFile;
import org.example.file.FileTypy;

public class AbstractImageFile extends AbstractFile {



    public AbstractImageFile(String name, int size){
        super(name, size);

    }



    @Override
    public FileTypy gettype() {
        return FileTypy.IMAGE;
    }

    @Override
    public String getName() {
        return name;
    }
}
