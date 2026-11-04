package com.codingshuttle.distributed_lovable.account_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {

        System.out.println("JVM Timezone: " +
                java.util.TimeZone.getDefault().getID());
        SpringApplication.run(AccountServiceApplication.class, args);
	}

}
