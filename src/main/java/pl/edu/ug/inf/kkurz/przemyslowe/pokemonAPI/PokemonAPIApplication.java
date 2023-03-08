package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.service.PokemonService;

@SpringBootApplication
public class PokemonAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonAPIApplication.class, args);
	}

	@Bean
	public CommandLineRunner setUpApp(@Autowired PokemonService pokemonService) {
		return (args) -> {

			pokemonService.learning();

		};
	}


}
