package com.callcenter.CallCenterApplication;

import com.callcenter.CallCenterApplication.usecases.ConsultCep;
import com.callcenter.CallCenterApplication.usecases.ConsultCounties;
import com.callcenter.CallCenterApplication.usecases.ConsultStates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CallCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallCenterApplication.class, args);
	}

	@Bean
	public ConsultStates consultStates() {
		return new ConsultStates();
	}

	@Bean
	public ConsultCounties consultMunicipalities() {
		return new ConsultCounties();
	}

	@Bean
	public ConsultCep consultCep() {
		return new ConsultCep();
	}

}
