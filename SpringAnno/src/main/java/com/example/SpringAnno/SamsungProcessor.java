package com.example.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SamsungProcessor implements ACProcessor {

	
	public void processor() {
		System.out.println("Worlds Best Processr");
	}
}
