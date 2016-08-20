package com.balhau.tuts.exercises.chaining.sillymockserver;

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

    public boolean isEquivalent(SillyRequest request){
        if (this.equals(request)){
            return true;
        }
        if(
            this.method.equals(request.method) &&
            this.path.equals(request.path) && this.body.equals(request.body) && containsHeaders(this.headers,request.headers)
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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
