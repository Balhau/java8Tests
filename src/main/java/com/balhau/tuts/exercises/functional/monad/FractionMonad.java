package com.balhau.tuts.exercises.functional.monad;

import com.balhau.tuts.exercises.functional.Transform;

/**
 * Created by vitorfernandes on 6/3/16.
 */
public class FractionMonad implements Monad<Integer>{

    private final FractionMonad INVALID_FRACTION=new FractionMonad();

    private int numerator;
    private int denominator;

    public FractionMonad(){

    }

    @Override
    public <U> Monad<U> with(Transform<Monad<Integer>, Monad<U>> transform) {
        try{
            return transform.transform(this);
        }catch (Exception ex) {
            return (Monad<U>)INVALID_FRACTION;
        }
    }

    public FractionMonad(int n, int d){
        this.numerator=n;
        this.denominator=d;
    }

    @Override
    public Integer of() {
        return null;
    }
}
