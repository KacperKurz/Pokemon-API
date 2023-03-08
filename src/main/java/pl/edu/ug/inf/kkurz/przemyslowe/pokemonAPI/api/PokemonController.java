package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.api;

import org.springframework.web.bind.annotation.*;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Pokemon;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Type;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.service.PokemonService;

import javax.validation.Valid;

@RestController
public class PokemonController {
    final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/api/pokemon")
    Iterable<Pokemon> getPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/api/pokemon/byType/{type}")
    Iterable<Pokemon> getPokemonByType(@PathVariable Type type) {
        return pokemonService.findByType(type);
    }

    @GetMapping("/api/pokemon/{id}")
    Pokemon getPokemonById(@PathVariable Long id) {
        return pokemonService.findById(id).orElse(null);
    }

    @PostMapping("/api/pokemon")
    Pokemon addPokemon(@Valid Pokemon pokemon) {
        return pokemonService.addPokemon(pokemon);
    }

    @DeleteMapping("/api/pokemon/{id}")
    void deletePokemon(@PathVariable Long id) {
        pokemonService.deletePokemon(id);
    }
}
