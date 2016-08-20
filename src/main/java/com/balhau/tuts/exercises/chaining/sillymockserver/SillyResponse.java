package com.balhau.tuts.exercises.chaining.sillymockserver;

import com.google.gson.Gson;

import java.util.Map;

/**
 * Created by vitorfernandes on 8/20/16.
 */
public class SillyResponse {
    public final int httpStatus;
    public final Map<String,String> cookies;
    public final Map<String,String> headers;
    public final String body;

    public SillyResponse(int httpStatus, Map<String, String> cookies, Map<String, String> headers, String body) {
        this.httpStatus = httpStatus;
        this.cookies = cookies;
        this.headers = headers;
        this.body = body;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
