package com.balhau.tuts.exercises;

import java.util.ArrayList;
import java.util.List;
import static com.balhau.tuts.exercises.functional.FunctionalCalls.*;


public class FunctionalsApp {
	public static void main(String[] args){
		List<String> strs=new ArrayList<String>();
		strs.addAll(toCollection("Hello Master Wayne. Me sucky sucky long time...".split(" ")));
		callOn(
				map(strs, (a) -> {
						return a.length();
					}
				)
			  ,(num) -> {
				  System.out.println("Num chars: "+num);
			  }
		);
	}
}
