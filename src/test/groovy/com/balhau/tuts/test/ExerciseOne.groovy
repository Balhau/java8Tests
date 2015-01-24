package com.balhau.tuts.test

import spock.lang.Specification;

class ExerciseOne extends Specification {
	
	private String data;
	
	def setup(){
		data="Hello Tests"
	}
	
	def "Number of ebooks on Kobo"() {
		when:
			data="Hello Tests"
		then:
			data.equals("Hello Tests")
	}
}
