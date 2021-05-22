package pl.dietadvisor.recipescraper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.dietadvisor.common.recipeScraper.config.RecipeScraper;

@SpringBootApplication
@RecipeScraper
public class RecipeScraperApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeScraperApplication.class, args);
    }

}
