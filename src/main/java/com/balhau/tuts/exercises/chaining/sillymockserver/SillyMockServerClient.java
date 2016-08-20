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

    public SillyMockServerClient when(SillyRequestBuilder request){
        this.requests.add(request.build());
        return this;
    }

    public SillyMockServerClient respond(SillyResponseBuilder response){
        this.responses.add(response.build());
        return this;
    }

    private int findRequest(SillyRequest request){
        int aux=0;
        for(SillyRequest current : requests){
            if(SillyRequest.isEquivalent(current,request)) {
                return aux;
            }
            aux++;
        }
        return -1;
    }

    public static SillyResponseBuilder response(){
        return new SillyResponseBuilder();
    }

    public static SillyRequestBuilder request(){
        return new SillyRequestBuilder();
    }



    public SillyResponse call(SillyRequest request) throws Exception{
        int pos = findRequest(request);
        if(pos==-1){
            throw new Exception("Request not mapped");
        }
        return this.responses.get(findRequest(request));
    }
}
