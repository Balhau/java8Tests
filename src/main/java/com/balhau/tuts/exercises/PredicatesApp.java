package com.balhau.tuts.exercises;


import static com.balhau.tuts.exercises.functional.predicates.PredicateFactory.*;

/**
 * Created by vitorfernandes on 2/20/16.
 */
public class PredicatesApp {
    public static void main(String[] args) {
        int number = -10;

        System.out.println(number + " is: ");
        System.out.println(number+" is even and positive: "+And(IS_EVEN,IS_POSITIVE).verify(number));
        System.out.println(number+" is not (even and positive): "+Not(And(IS_EVEN,IS_POSITIVE)).verify(number));
        System.out.println(number+" is even or positive: "+Or(IS_EVEN,IS_POSITIVE).verify(number));
        System.out.println(number+" is even and not positive: "+And(IS_EVEN,Not(IS_POSITIVE)).verify(number));

        String ola = "olo";
        System.out.println(ola+" is empty or null: " + IS_EMPTY_OR_NULL.verify(ola));
        System.out.println(ola+ " is palindrome: " + IS_PALINDROME.verify(ola));
        System.out.println(ola+ " is palindrome and empty or null: "+And(IS_PALINDROME,IS_EMPTY_OR_NULL).verify(ola));
        System.out.println(ola+ " is not palindrome: "+Not(IS_PALINDROME).verify(ola));

    }
}
