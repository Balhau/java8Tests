package com.balhau.tuts.exercises;

import com.balhau.tuts.exercises.chaining.Patient;
import com.balhau.tuts.exercises.chaining.PatientBuilder;

import java.time.Instant;
import java.util.Date;

/**
 * Created by vitorfernandes on 8/20/16.
 */
public class ChainingApp {
    public static void main(String[] args) {
        PatientBuilder builder = new PatientBuilder();
        Patient patient = builder.
                Accidents(

                )
                .Address("Northville")
                .Birth(Date.from(Instant.now()))
                .Diseases(
                        "AIDS",
                        "Gonorrhea",
                        "Hepatitis C"
                )
                .BloodPreassure(100)
                .Colestrol(40)
                .BpmAtRest(78).build();

        System.out.println(patient);

    }
}
