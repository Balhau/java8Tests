package com.balhau.tuts.exercises.chaining.sillymockserver;

import com.balhau.tuts.exercises.chaining.Builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitorfernandes on 8/20/16.
 */
public class SillyResponseBuilder implements Builder<SillyResponse>{

    public int httpStatus;
    public Map<String,String> cookies;
    public Map<String,String> headers;
    public String body;

    public SillyResponseBuilder(){
        this.headers=new HashMap<>();
        this.cookies=new HashMap<>();
    }

    public SillyResponseBuilder withCookie(String key,String value){
        this.cookies.put(key,value);
        return this;
    }

    public SillyResponseBuilder withHeader(String key,String value){
        this.headers.put(key,value);
        return this;
    }

    public SillyResponseBuilder withBody(String body){
        this.body=body;
        return this;
    }

    public SillyResponseBuilder withHttpStatus(int httpStatus){
        this.httpStatus=httpStatus;
        return this;
    }

    @Override
    public SillyResponse build() {
        return new SillyResponse(httpStatus,cookies,headers,body);
    }
}
