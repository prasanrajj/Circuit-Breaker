
package com.prasanna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CbSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbSenderApplication.class, args);
	}

}

//http://localhost:8081/actuator/circuitbreakers   
//even when the responder is shut, the connection is still closed( ~ current pass)
//because we set it till some N times later it go to HALF_OPEN and checks N times and 
//go to either OPEN or CLOSED state accordingly
