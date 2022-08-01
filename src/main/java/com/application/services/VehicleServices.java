package com.application.services;

import com.application.interfaces.LogAspect;
import com.application.interfaces.Speakers;
import com.application.interfaces.Tyres;
import com.application.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song){
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted){
        return tyres.rotate();
    }

    public String applyBrake(boolean vehicleStarted){
        return tyres.stop();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
