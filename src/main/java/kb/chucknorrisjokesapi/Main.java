package kb.chucknorrisjokesapi;

import lombok.extern.log4j.Log4j;

import java.util.Optional;
import java.util.Scanner;

@Log4j
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ApiParameters parameters = new ApiParameters();

        chooseCategory(scanner, parameters);


    }

    private static void chooseCategory(Scanner scanner, ApiParameters parameters) {
        do {
            log.info("Please write me what jokes you want:");
            log.info("Categories:");
            log.info("1 - random");
            log.info("2 - animal");
            log.info("3 - career");
            log.info("4 - celebrity");
            log.info("5 - dev");
            log.info("6 - explicit");
            log.info("7 - fashion");
            log.info("8 - food");
            log.info("9 - history");
            log.info("10 - money");
            log.info("11 - movie");
            log.info("12 - music");
            log.info("13 - political");
            log.info("14 - religion");
            log.info("15 - science");
            log.info("16 - sport");
            log.info("17 - travel");
            Optional<JokesCategory> optionalCategory = JokesCategory.parse(scanner.nextLine());
            if (optionalCategory.isPresent()) {
                parameters.setCategory(optionalCategory.get());
            } else {
                log.error("Error: Wrong input.");
            }
        } while (parameters.getCategory() == null);
    }
}
