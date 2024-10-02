package org.example.file.music;

import org.example.file.AbstractFile;
import org.example.file.FileTypy;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile{
    protected String bandName;
    protected String title;

    public AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name,size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileTypy gettype() {
        return FileTypy.MUSIC;
    }
}
