package com.balhau.tuts.exercises.functional;

import com.balhau.tuts.exercises.chaining.sillymockserver.SillyMockServerClient;
import static com.balhau.tuts.exercises.chaining.sillymockserver.SillyMockServerClient.*;

/**
 * Created by vitorfernandes on 8/20/16.
 */
public class SillyMockServerExample {
    public static void main(String[] args) throws  Exception{
        SillyMockServerClient mockServerClient =
                new SillyMockServerClient("localhost",10000)
                .when(
                        request()
                            .withMethod("POST")
                            .withPath("/hello")
                            .withBody("<hello>sir</hello>")
                )
                .respond(
                        response()
                            .withHttpStatus(302)
                            .withBody("OK")
                            .withCookie("sessionId","ASDASDALSDHASHDKJA")
                            .withHeader("Location","http://serverendpoint.local")
                );

        System.out.println(mockServerClient.call(request()
                .withMethod("POST")
                .withPath("/hello")
                .withBody("<hello>sir</hello>").build()));

    }
}
