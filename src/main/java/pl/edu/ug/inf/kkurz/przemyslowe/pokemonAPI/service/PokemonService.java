package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.configuration.PokemonParser;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Move;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Pokemon;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Type;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.repository.MoveRepository;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.repository.PokemonRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class PokemonService {
    final PokemonRepository pokemonRepository;
    final MoveRepository moveRepository;

    public PokemonService(PokemonRepository pokemonRepository, MoveRepository moveRepository) {
        this.pokemonRepository = pokemonRepository;
        this.moveRepository = moveRepository;
    }

    public Iterable<Pokemon> getAllPokemon(){
        return pokemonRepository.getAllPokemon();
    }

    public Iterable<Pokemon> findByType(Type type){
        return pokemonRepository.findByType(type);
    }

    public Optional<Pokemon> findById(long id){
        return pokemonRepository.findById(id);
    }

    public Pokemon addPokemon(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    public void deletePokemon(long id){
        pokemonRepository.deleteById(id);
    }

    public void learning(){
        ArrayList<Move> moves = new ArrayList<Move>();
        List<Pokemon> pokemon = new PokemonParser(new RestTemplateBuilder()).getList();
        pokemonRepository.saveAll(pokemon);
    }
}
