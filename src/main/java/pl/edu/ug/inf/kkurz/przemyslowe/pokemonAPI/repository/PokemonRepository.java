package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Pokemon;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Type;

import java.util.List;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
    List<Pokemon> findByName(String name);

    @Query("SELECT p FROM Pokemon p")
//    @Query("SELECT p FROM Pokemon p JOIN FETCH p.moves")
    List<Pokemon> getAllPokemon();

    @Query("SELECT p FROM Pokemon p WHERE p.type1=?1 OR p.type2=?1")
    List<Pokemon> findByType(Type type);


}
