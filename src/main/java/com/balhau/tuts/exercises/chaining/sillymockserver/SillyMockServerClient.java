package com.balhau.tuts.exercises.chaining.sillymockserver;

import java.util.ArrayList;
import java.util.List;

/**
 * This is inspired in the MockServerClient of the project mock server. And it only purpose
 * is to demonstrate how we can use chaining to build a DSL
 * Created by vitorfernandes on 8/20/16.
 */
public class SillyMockServerClient {
    private final int port;
    private final String host;
    private final List<SillyRequest> requests;
    private final List<SillyResponse> responses;

    public SillyMockServerClient(String host,int port){
        this.port=port;
        this.host=host;
        this.requests=new ArrayList<>();
        this.responses=new ArrayList<>();
    }

    public SillyMockServerClient when(SillyRequest request){
        this.requests.add(request);
        return this;
    }

    public SillyMockServerClient respond(SillyResponse response){
        this.responses.add(response);
        return this;
    }

    private int findRequest(SillyRequest request){
        return 0;
    }

    public SillyResponse call(SillyRequest request){
        return this.responses.get(findRequest(request));
    }
}
