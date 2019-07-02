package com.example.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class LgProcessor implements ACProcessor {

	
	public void processor() {
		System.out.println( "2 nd Worlds Best Processr");
	}
}
