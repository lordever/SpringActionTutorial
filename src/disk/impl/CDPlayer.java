package disk.impl;

import disk.CompactDisk;
import disk.MediaPlayer;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisk disk;

    public void setDisk(CompactDisk disk) {
        this.disk = disk;
    }

    public void play() {
        disk.play();
    }
}
