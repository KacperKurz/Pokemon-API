package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Move;

import java.util.List;

@Repository
public interface MoveRepository extends CrudRepository<Move, Long> {
    List<Move> findByName(String name);
}
