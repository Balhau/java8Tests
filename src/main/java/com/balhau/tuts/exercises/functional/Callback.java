package com.balhau.tuts.exercises.functional;

@FunctionalInterface
public interface Callback<T>{
	void callOn(T data);
}
