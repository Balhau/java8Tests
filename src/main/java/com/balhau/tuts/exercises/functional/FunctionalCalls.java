package com.balhau.tuts.exercises.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FunctionalCalls {
	
	public static <T> Collection<T> toCollection(T[] arr){
		List<T> arrL=new ArrayList<T>();
		for(T el: arr){
			arrL.add(el);
		}
		return arrL;
	}
	
	public static <T> void callOn(List<T> data,Callback<T> callback){
		for(T el: data){
			callback.callOn(el);
		}
	}
	
	public static <T,U> List<U> map(List<T> data,Transform<T, U> mapper){
		List<U> out=new ArrayList<U>();
		for(T el : data){
			out.add(mapper.transform(el));
		}
		return out;
	}
}
