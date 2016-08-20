package com.balhau.tuts.exercises.chaining;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitorfernandes on 8/20/16.
 */
public class Builders {

    public interface BuilderLoader{
        Builder get();
    }

    private static final Map<String,BuilderLoader> builderMap;
    public final static String PATIENT="patient";

    static{
        builderMap=new HashMap<>();
        builderMap.put(PATIENT, () -> new PatientBuilder());
    }

    public static Builder get(String typeOfBuilder){
        return builderMap.get(typeOfBuilder).get();
    }
}
