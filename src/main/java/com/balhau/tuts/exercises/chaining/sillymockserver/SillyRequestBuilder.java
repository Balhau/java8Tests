package com.balhau.tuts.exercises.chaining.sillymockserver;

import com.balhau.tuts.exercises.chaining.Builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Builder for SillyRequest
 * Created by vitorfernandes on 8/20/16.
 */
public class SillyRequestBuilder implements Builder<SillyRequest>{
    private String method;
    private String path;
    private Map<String,String> headers;
    private String body;

    public SillyRequestBuilder(){
        this.headers=new HashMap<>();
    }

    public SillyRequestBuilder withMethod(String method){
        this.method=method;
        return this;
    }

    public SillyRequestBuilder withPath(String path){
        this.path=path;
        return this;
    }

    public SillyRequestBuilder withHeader(String key,String val){
        this.headers.put(key,val);
        return this;
    }

    public SillyRequestBuilder withBody(String body){
        this.body=body;
        return this;
    }

    @Override
    public SillyRequest build() {
        return new SillyRequest(
                method,path,headers,body
        );
    }
}
