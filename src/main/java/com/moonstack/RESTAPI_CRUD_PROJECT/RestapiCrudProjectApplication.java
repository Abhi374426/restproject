package com.moonstack.RESTAPI_CRUD_PROJECT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.InvalidParameterException;

@SpringBootApplication
public class RestapiCrudProjectApplication {

	public static void main(String[] args) throws Exception
	{
		if (args.length != 2){
			throw new InvalidParameterException();
		}
		int b=Integer.parseInt(args[0]);
		int a=Integer.parseInt(args[1]);
		int c=b/a;
		SpringApplication.run(RestapiCrudProjectApplication.class, args);
	}

}
