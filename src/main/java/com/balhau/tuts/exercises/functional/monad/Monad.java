package com.balhau.tuts.exercises.functional.monad;

import com.balhau.tuts.exercises.functional.Transform;

/**
 * Created by vitorfernandes on 6/3/16.
 */
public interface Monad<T> {
    <U> Monad<U> with(Transform<Monad<T>,Monad<U>> transform);
    T of();
}
