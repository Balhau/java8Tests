package com.balhau.tuts.exercises.functional;


@FunctionalInterface
public interface Transform<T,U>{
	U transform(T object);
}
