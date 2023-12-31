package com.demo.Client;

import com.demo.Client.Model.Client;
import com.demo.Client.Repository.ClientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepo cr)
	{
		return args -> {
			cr.save(new Client(Long.parseLong("1"),"Mayssae","Jabbar",Float.parseFloat("23")));
			cr.save(new Client(Long.parseLong("2"), "Ouissal","Hadid",Float.parseFloat("22")));
			cr.save(new Client(Long.parseLong("3"), "Younes","Hssine",Float.parseFloat("22")));
			cr.save(new Client(Long.parseLong("4"), "Mariem","Hajji",Float.parseFloat("22")));

		};
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
