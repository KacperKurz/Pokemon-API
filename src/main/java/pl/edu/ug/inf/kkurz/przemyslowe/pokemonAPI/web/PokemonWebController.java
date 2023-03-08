package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Pokemon;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.service.PokemonService;

import javax.validation.Valid;

@Controller
public class PokemonWebController {
    private final PokemonService pokemonService;

    public PokemonWebController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/web/pokemon")
    public String pokemon(Model model){
        model.addAttribute("pokemon", pokemonService.getAllPokemon());
        return "pokemon-all";
    }

    @GetMapping("/web/pokemon/form")
    public String pokemonEdit(Model model){
        model.addAttribute("pokemonToAdd", new Pokemon());
        return "pokemon-form";
    }

    @PostMapping("/web/pokemon")
    public String addPokemon(@ModelAttribute @Valid Pokemon pokemonToAdd, Model model){
        pokemonService.addPokemon(pokemonToAdd);
        model.addAttribute("pokemon", pokemonService.getAllPokemon());
        return "pokemon-all";
    }

    @GetMapping("/web/pokemon/delete/{id}")
    public String deletePokemon(@PathVariable int id, Model model){
        pokemonService.deletePokemon(id);
        model.addAttribute("pokemon", pokemonService.getAllPokemon());
        return "redirect:/web/pokemon";
    }
}
