package com.balhau.tuts.exercises.functional.predicates;

/**
 * Created by vitorfernandes on 2/17/16.
 */
public abstract class PredicateBase<T> implements Predicate<T> {

    protected Predicate<T>[] decorators;
    public PredicateBase(Predicate<T>... decorators){
        this.decorators=decorators;
    }

    public PredicateBase(){
        
    }

    public abstract boolean verify(T element);

}
