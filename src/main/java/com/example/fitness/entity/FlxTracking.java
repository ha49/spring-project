package com.example.fitness.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class FlxTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    // @JoinColumn(name = "flxClient_id")
    private FlxClient flxClient;


    private Date currentDate;
    private int dietRate;
    private int exerciseRate;
    private int mode;
    private String clientNote;
    private String coachNote;
    private boolean motivationalMessageFlag;
    private String motivationalMessagePath;

    public FlxTracking() {

    }

    public FlxTracking(Date currentDate, int dietRate,
                       int exerciseRate, int mode, String clientNote,
                       String coachNote, boolean motivationalMessageFlag, String motivationalMessagePath) {
        this.currentDate = currentDate;
        this.dietRate = dietRate;
        this.exerciseRate = exerciseRate;
        this.mode = mode;
        this.clientNote = clientNote;
        this.coachNote = coachNote;
        this.motivationalMessageFlag = motivationalMessageFlag;
        this.motivationalMessagePath = motivationalMessagePath;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public int getDietRate() {
        return dietRate;
    }

    public void setDietRate(int dietRate) {
        this.dietRate = dietRate;
    }

    public int getExerciseRate() {
        return exerciseRate;
    }

    public void setExerciseRate(int exerciseRate) {
        this.exerciseRate = exerciseRate;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String getClientNote() {
        return clientNote;
    }

    public void setClientNote(String clientNote) {
        this.clientNote = clientNote;
    }

    public String getCoachNote() {
        return coachNote;
    }

    public void setCoachNote(String coachNote) {
        this.coachNote = coachNote;
    }

    public boolean isMotivationalMessageFlag() {
        return motivationalMessageFlag;
    }

    public void setMotivationalMessageFlag(boolean motivationalMessageFlag) {
        this.motivationalMessageFlag = motivationalMessageFlag;
    }

    public String getMotivationalMessagePath() {
        return motivationalMessagePath;
    }

    public void setMotivationalMessagePath(String motivationalMessagePath) {
        this.motivationalMessagePath = motivationalMessagePath;
    }
}

