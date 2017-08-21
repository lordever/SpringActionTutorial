package disk.impl;

import disk.CompactDisk;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisk {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "Sgt. Pepper";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
