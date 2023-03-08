package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.configuration;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.client.RestTemplate;
import pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain.Pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.List;

public class PokemonParser {
    private final RestTemplate restTemplate;

    public PokemonParser(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getCsvString() throws IOException {
        return Files.readString(new ClassPathResource("FirstGenPokemon.csv").getFile().toPath());

    }

    public List<Pokemon> parseCsv(String csv) {
        try (Reader reader = new BufferedReader(new StringReader(csv))) {

            CsvToBean<Pokemon> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Pokemon.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return csvToBean.parse();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Pokemon> getList(){
        try {
            return parseCsv(getCsvString());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
