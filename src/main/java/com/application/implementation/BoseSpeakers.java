package com.application.implementation;

import com.application.interfaces.Speakers;
import com.application.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(Song song){
        return "Playing the song " + song.getTitle()+ " by " + song.getSingerName() + " with Bose speakers";
    }

}
