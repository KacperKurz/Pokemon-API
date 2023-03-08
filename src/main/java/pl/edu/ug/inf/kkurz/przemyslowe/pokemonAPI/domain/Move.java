package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Move {

    private @Id long id;
    private String name;

    private Type type;

    private Category category;
    private int power;
    private int accuracy;
    private int pp;
    @ManyToMany(mappedBy = "moves")
    private Collection<Pokemon> pokemons;

    public Move(long id, String name, Type type, Category category, int power, int accuracy, int pp, Collection<Pokemon> pokemons) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.pokemons = pokemons;
    }

    public Move() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public Collection<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Collection<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return "Move{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", category=" + category +
                ", power=" + power +
                ", accuracy=" + accuracy +
                ", pp=" + pp +
                ", pokemons=" + pokemons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return id == move.id && power == move.power && accuracy == move.accuracy && pp == move.pp && name.equals(move.name) && type == move.type && category == move.category && pokemons.equals(move.pokemons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, category, power, accuracy, pp, pokemons);
    }
}
