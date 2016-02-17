package com.balhau.tuts.exercises.functional.predicates;

/**
 * This is a contract for boolean operations.
 * Created by vitorfernandes on 2/17/16.
 */
public interface Predicate<T> {
    boolean verify(T element);
}
