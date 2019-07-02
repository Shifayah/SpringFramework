package com.example.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AirConditioner {

	@Autowired
	@Qualifier("lgProcessor")
	private ACProcessor acProcessor;
	
	public ACProcessor getAcProcessor() {
		return acProcessor;
	}

	public void setAcProcessor(ACProcessor acProcessor) {
		this.acProcessor = acProcessor;
	}

	public void config() {
		System.out.println("2 ton,2018,5 star");
		acProcessor.processor();
	}
}
