package com.balhau.tuts.exercises.chaining.sillymockserver;

import com.google.gson.Gson;

import java.util.Map;
import java.util.Set;

/**
 * Implementing the logic needed for the chaining with SillyRequest objects
 * Created by vitorfernandes on 8/20/16.
 */
public class SillyRequest {
    private final String method;
    private final String path;
    private final Map<String,String> headers;
    private final String body;

    public SillyRequest(String method,String path,Map<String,String> headers,String body){
        this.method=method;
        this.path=path;
        this.headers=headers;
        this.body=body;
    }

    public static boolean isEquivalent(SillyRequest requestA,SillyRequest requestB){
        if (requestA.equals(requestB)){
            return true;
        }
        if(
                requestA.method.equals(requestB.method) &&
                        requestA.path.equals(requestB.path) && requestA.body.equals(requestB.body) && containsHeaders(requestA.headers,requestB.headers)
                ){
            return true;
        }
        return false;

    }

    private static boolean containsHeaders(Map<String,String> superset,Map<String,String> subset){
        Set<String> keys = subset.keySet();
        for(String key : keys){
            if(!superset.containsKey(key) && !superset.get(key).equals(subset.get(key))){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
