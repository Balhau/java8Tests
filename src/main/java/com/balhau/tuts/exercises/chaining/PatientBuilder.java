package com.balhau.tuts.exercises.chaining;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Builder for Patient concept
 * Created by vitorfernandes on 8/20/16.
 */
public class PatientBuilder implements Builder<Patient>{

    private String name;
    private List<String> diseases;
    private List<String> accidents;
    private Date birth;
    private String address;
    private int bloodPreassure;
    private int colesterolLevel;
    private int bpmAtRest;

    public PatientBuilder(){
    }

    public PatientBuilder Name(String name){
        this.name=name;
        return this;
    }

    public PatientBuilder Diseases(String... diseases){
        List<String> aux = new ArrayList<>();
        for(String disease : diseases){
            aux.add(disease);
        }
        this.diseases=aux;
        return this;
    }

    public PatientBuilder Accidents(String... accidents){
        List<String> aux = new ArrayList<>();
        for(String accident : accidents){
            aux.add(accident);
        }
        this.accidents=aux;
        return this;
    }

    public PatientBuilder Birth(Date date){
        this.birth=date;
        return this;
    }

    public PatientBuilder Address(String address){
        this.address=address;
        return this;
    }

    public PatientBuilder BloodPreassure(int bloodPreassure){
        this.bloodPreassure=bloodPreassure;
        return this;
    }

    public PatientBuilder Colestrol(int colesterolLevel){
        this.colesterolLevel=colesterolLevel;
        return this;
    }

    public PatientBuilder BpmAtRest(int bpmAtRest){
        this.bpmAtRest=bpmAtRest;
        return this;
    }

    @Override
    public Patient build() {
        return new Patient(
                name,diseases,accidents,birth,address,
                bloodPreassure,colesterolLevel,bpmAtRest
        );
    }
}
