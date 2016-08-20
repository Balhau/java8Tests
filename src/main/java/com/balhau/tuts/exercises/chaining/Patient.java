package com.balhau.tuts.exercises.chaining;


import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

/**
 * This represents the concept of medical patient, several fields are needed to describe
 * a patient
 * Created by balhau on 8/20/16.
 */
public class Patient {
    private final String name;
    private final List<String> diseases;
    private final List<String> accidents;
    private final Date birth;
    private final String address;
    private final int bloodPreassure;
    private final int colesterolLevel;
    private final int bpmAtRest;

    public Patient(String name, List<String> diseases, List<String> accidents,
                   Date birth, String address, int bloodPreassure,
                   int colesterolLevel, int bpmAtRest
    ){
        this.name = name;
        this.diseases = diseases;
        this.accidents = accidents;
        this.birth = birth;
        this.address = address;
        this.bloodPreassure = bloodPreassure;
        this.colesterolLevel = colesterolLevel;
        this.bpmAtRest = bpmAtRest;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
