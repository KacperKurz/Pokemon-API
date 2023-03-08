package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Pokemon {
    private @Id @GeneratedValue @NotNull long id;
    private @NotNull String name;
    private @NotNull Type type1;
    private Type type2;
    private @NotNull double height;
    private @NotNull double weight;
    private @NotNull double male_pct;
    private @NotNull double female_pct;
    private @NotNull double catch_rate;
    private @NotNull int exp_points;
    private @NotNull String exp_speed;
    private @NotNull int base_total;
    private @NotNull int hp;
    private @NotNull int attack;
    private @NotNull int defense;
    private @NotNull int special;
    private @NotNull int speed;
    private @NotNull double normal_dmg;
    private @NotNull double fire_dmg;
    private @NotNull double water_dmg;
    private @NotNull double eletric_dmg;
    private @NotNull double grass_dmg;
    private @NotNull double ice_dmg;
    private @NotNull double fight_dmg;
    private @NotNull double poison_dmg;
    private @NotNull double ground_dmg;
    private @NotNull double flying_dmg;
    private @NotNull double psychic_dmg;
    private @NotNull double bug_dmg;
    private @NotNull double rock_dmg;
    private @NotNull double ghost_dmg;
    private @NotNull double dragon_dmg;
    private @NotNull int evolutions;
    private @NotNull boolean legendary;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Collection<Move> moves;

    public Pokemon() {
    }

    public Pokemon(long id, String name, String type1, String type2, double height, double weight, double male_pct, double female_pct, double catch_rate, int exp_points, String exp_speed, int base_total, int hp, int attack, int defense, int special, int speed, double normal_dmg, double fire_dmg, double water_dmg, double eletric_dmg, double grass_dmg, double ice_dmg, double fight_dmg, double poison_dmg, double ground_dmg, double flying_dmg, double psychic_dmg, double bug_dmg, double rock_dmg, double ghost_dmg, double dragon_dmg, int evolutions, boolean legendary, Collection<Move> moves) {
        this.id = id;
        this.name = name;
        this.type1 = Type.valueOf(type1);
        this.type2 = Type.valueOf(type2);
        this.height = height;
        this.weight = weight;
        this.male_pct = male_pct;
        this.female_pct = female_pct;
        this.catch_rate = catch_rate;
        this.exp_points = exp_points;
        this.exp_speed = exp_speed;
        this.base_total = base_total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.special = special;
        this.speed = speed;
        this.normal_dmg = normal_dmg;
        this.fire_dmg = fire_dmg;
        this.water_dmg = water_dmg;
        this.eletric_dmg = eletric_dmg;
        this.grass_dmg = grass_dmg;
        this.ice_dmg = ice_dmg;
        this.fight_dmg = fight_dmg;
        this.poison_dmg = poison_dmg;
        this.ground_dmg = ground_dmg;
        this.flying_dmg = flying_dmg;
        this.psychic_dmg = psychic_dmg;
        this.bug_dmg = bug_dmg;
        this.rock_dmg = rock_dmg;
        this.ghost_dmg = ghost_dmg;
        this.dragon_dmg = dragon_dmg;
        this.evolutions = evolutions;
        this.legendary = legendary;
        this.moves = Objects.requireNonNullElseGet(moves, ArrayList::new);
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

    public Type getType1() {
        return type1;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public Type getType2() {
        return type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMale_pct() {
        return male_pct;
    }

    public void setMale_pct(double male_pct) {
        this.male_pct = male_pct;
    }

    public double getFemale_pct() {
        return female_pct;
    }

    public void setFemale_pct(double female_pct) {
        this.female_pct = female_pct;
    }

    public double getCatch_rate() {
        return catch_rate;
    }

    public void setCatch_rate(double catch_rate) {
        this.catch_rate = catch_rate;
    }

    public int getExp_points() {
        return exp_points;
    }

    public void setExp_points(int exp_points) {
        this.exp_points = exp_points;
    }

    public String getExp_speed() {
        return exp_speed;
    }

    public void setExp_speed(String exp_speed) {
        this.exp_speed = exp_speed;
    }

    public int getBase_total() {
        return base_total;
    }

    public void setBase_total(int base_total) {
        this.base_total = base_total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getNormal_dmg() {
        return normal_dmg;
    }

    public void setNormal_dmg(double normal_dmg) {
        this.normal_dmg = normal_dmg;
    }

    public double getFire_dmg() {
        return fire_dmg;
    }

    public void setFire_dmg(double fire_dmg) {
        this.fire_dmg = fire_dmg;
    }

    public double getWater_dmg() {
        return water_dmg;
    }

    public void setWater_dmg(double water_dmg) {
        this.water_dmg = water_dmg;
    }

    public double getEletric_dmg() {
        return eletric_dmg;
    }

    public void setEletric_dmg(double eletric_dmg) {
        this.eletric_dmg = eletric_dmg;
    }

    public double getGrass_dmg() {
        return grass_dmg;
    }

    public void setGrass_dmg(double grass_dmg) {
        this.grass_dmg = grass_dmg;
    }

    public double getIce_dmg() {
        return ice_dmg;
    }

    public void setIce_dmg(double ice_dmg) {
        this.ice_dmg = ice_dmg;
    }

    public double getFight_dmg() {
        return fight_dmg;
    }

    public void setFight_dmg(double fight_dmg) {
        this.fight_dmg = fight_dmg;
    }

    public double getPoison_dmg() {
        return poison_dmg;
    }

    public void setPoison_dmg(double poison_dmg) {
        this.poison_dmg = poison_dmg;
    }

    public double getGround_dmg() {
        return ground_dmg;
    }

    public void setGround_dmg(double ground_dmg) {
        this.ground_dmg = ground_dmg;
    }

    public double getFlying_dmg() {
        return flying_dmg;
    }

    public void setFlying_dmg(double flying_dmg) {
        this.flying_dmg = flying_dmg;
    }

    public double getPsychic_dmg() {
        return psychic_dmg;
    }

    public void setPsychic_dmg(double psychic_dmg) {
        this.psychic_dmg = psychic_dmg;
    }

    public double getBug_dmg() {
        return bug_dmg;
    }

    public void setBug_dmg(double bug_dmg) {
        this.bug_dmg = bug_dmg;
    }

    public double getRock_dmg() {
        return rock_dmg;
    }

    public void setRock_dmg(double rock_dmg) {
        this.rock_dmg = rock_dmg;
    }

    public double getGhost_dmg() {
        return ghost_dmg;
    }

    public void setGhost_dmg(double ghost_dmg) {
        this.ghost_dmg = ghost_dmg;
    }

    public double getDragon_dmg() {
        return dragon_dmg;
    }

    public void setDragon_dmg(double dragon_dmg) {
        this.dragon_dmg = dragon_dmg;
    }

    public int getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(int evolutions) {
        this.evolutions = evolutions;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }

    public Collection<Move> getMoves() {
        return moves;
    }

    public void setMoves(Collection<Move> moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", height=" + height +
                ", weight=" + weight +
                ", male_pct=" + male_pct +
                ", female_pct=" + female_pct +
                ", catch_rate=" + catch_rate +
                ", exp_points=" + exp_points +
                ", exp_speed='" + exp_speed + '\'' +
                ", base_total=" + base_total +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", special=" + special +
                ", speed=" + speed +
                ", normal_dmg=" + normal_dmg +
                ", fire_dmg=" + fire_dmg +
                ", water_dmg=" + water_dmg +
                ", eletric_dmg=" + eletric_dmg +
                ", grass_dmg=" + grass_dmg +
                ", ice_dmg=" + ice_dmg +
                ", fight_dmg=" + fight_dmg +
                ", poison_dmg=" + poison_dmg +
                ", ground_dmg=" + ground_dmg +
                ", flying_dmg=" + flying_dmg +
                ", psychic_dmg=" + psychic_dmg +
                ", bug_dmg=" + bug_dmg +
                ", rock_dmg=" + rock_dmg +
                ", ghost_dmg=" + ghost_dmg +
                ", dragon_dmg=" + dragon_dmg +
                ", evolutions=" + evolutions +
                ", legendary=" + legendary +
                ", moves=" + moves +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id == pokemon.id && Double.compare(pokemon.height, height) == 0 && Double.compare(pokemon.weight, weight) == 0 && Double.compare(pokemon.male_pct, male_pct) == 0 && Double.compare(pokemon.female_pct, female_pct) == 0 && Double.compare(pokemon.catch_rate, catch_rate) == 0 && exp_points == pokemon.exp_points && base_total == pokemon.base_total && hp == pokemon.hp && attack == pokemon.attack && defense == pokemon.defense && special == pokemon.special && speed == pokemon.speed && Double.compare(pokemon.normal_dmg, normal_dmg) == 0 && Double.compare(pokemon.fire_dmg, fire_dmg) == 0 && Double.compare(pokemon.water_dmg, water_dmg) == 0 && Double.compare(pokemon.eletric_dmg, eletric_dmg) == 0 && Double.compare(pokemon.grass_dmg, grass_dmg) == 0 && Double.compare(pokemon.ice_dmg, ice_dmg) == 0 && Double.compare(pokemon.fight_dmg, fight_dmg) == 0 && Double.compare(pokemon.poison_dmg, poison_dmg) == 0 && Double.compare(pokemon.ground_dmg, ground_dmg) == 0 && Double.compare(pokemon.flying_dmg, flying_dmg) == 0 && Double.compare(pokemon.psychic_dmg, psychic_dmg) == 0 && Double.compare(pokemon.bug_dmg, bug_dmg) == 0 && Double.compare(pokemon.rock_dmg, rock_dmg) == 0 && Double.compare(pokemon.ghost_dmg, ghost_dmg) == 0 && Double.compare(pokemon.dragon_dmg, dragon_dmg) == 0 && evolutions == pokemon.evolutions && legendary == pokemon.legendary && name.equals(pokemon.name) && type1 == pokemon.type1 && type2 == pokemon.type2 && exp_speed.equals(pokemon.exp_speed) && moves.equals(pokemon.moves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type1, type2, height, weight, male_pct, female_pct, catch_rate, exp_points, exp_speed, base_total, hp, attack, defense, special, speed, normal_dmg, fire_dmg, water_dmg, eletric_dmg, grass_dmg, ice_dmg, fight_dmg, poison_dmg, ground_dmg, flying_dmg, psychic_dmg, bug_dmg, rock_dmg, ghost_dmg, dragon_dmg, evolutions, legendary, moves);
    }
}
