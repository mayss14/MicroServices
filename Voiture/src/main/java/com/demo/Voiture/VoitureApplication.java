package com.demo.Voiture;

import com.demo.Voiture.Model.Client;
import com.demo.Voiture.Model.Voiture;
import com.demo.Voiture.Repository.VoitureRepo;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
public class VoitureApplication {


	//@FeignClient(name = "SERVICE-CLIENT")


	@Transactional
	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepo vr, ClientService cs){


		return args -> {
			Client c1 = cs.clientById(2L);
			Client c2 = cs.clientById(1L);
			Client c3 = cs.clientById(3L);

			vr.save(new Voiture(Integer.parseInt("1"), "Toyota", "A 25 333", "Corolla", 1L));
			vr.save(new Voiture(Integer.parseInt("2"), "Toyota", "A 25 333", "Corolla", 1L));
			vr.save(new Voiture(Integer.parseInt("3"), "Toyota", "A 25 333", "Corolla", 2L));

		};
	}
	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

}
