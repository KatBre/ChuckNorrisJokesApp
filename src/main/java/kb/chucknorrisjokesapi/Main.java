package kb.chucknorrisjokesapi;

import lombok.extern.log4j.Log4j;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Log4j
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ApiParameters parameters = new ApiParameters();
        JokesApi jokesApi = new JokesApi();

        chooseCategory(scanner, parameters);
        if (("category").equals(parameters.getCategory())) {
            chooseCategory(scanner, parameters);
        }
        List<String> jokesList = jokesApi.requestJokes(parameters);
        jokesList.forEach(log::info);

    }

    private static void chooseCategory(Scanner scanner, ApiParameters parameters) {
        do {
            log.info("Please write me what kind of jokes you want. Random from all categories or from chosen category:");
            log.info("random from all categories - type \"random\"");
            log.info("animal jokes - type \"animal\"");
            log.info("career jokes - type \"career\"");
            log.info("celebrity jokes - type \"celebrity\"");
            log.info("dev jokes - type \"dev\"");
            log.info("explicit jokes - type \"explicit\"");
            log.info("fashion jokes - type \"fashion\"");
            log.info("food jokes - type \"food\"");
            log.info("history jokes - type \"history\"");
            log.info("money jokes - type \"money\"");
            log.info("movie jokes - type \"movie\"");
            log.info("music jokes - type \"music\"");
            log.info("political jokes - type \"political\"");
            log.info("religion jokes - type \"religion\"");
            log.info("science jokes - type \"science\"");
            log.info("sport jokes - type \"sport\"");
            log.info("travel jokes - type \"travel\"");

            Optional<JokesCategory> optionalCategory = JokesCategory.parse(scanner.nextLine().toUpperCase());
            if (optionalCategory.isPresent()) {
                parameters.setCategory(optionalCategory.get());
            } else {
                log.error("Error: Wrong input.");
            }
        } while (parameters.getCategory() == null);
    }
}
