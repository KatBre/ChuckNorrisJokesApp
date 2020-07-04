package kb.chucknorrisjokesapi;

import java.util.Optional;

public enum JokesCategory {
    RANDOM("random"),
    ANIMAL("animal"),
    CAREER("career"),
    CELEBRITY("celebrity"),
    DEV("dev"),
    EXPLICIT("explicit"),
    FASHION("fashion"),
    FOOD("food"),
    HISTORY("history"),
    MONEY("money"),
    MOVIE("movie"),
    MUSIC("music"),
    POLITICAL("political"),
    RELIGION("religion"),
    SCIENCE("science"),
    SPORT("sport"),
    TRAVEL("travel");
    private String categoryName;

    JokesCategory(String categoryNumber) {
        this.categoryName = categoryNumber;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public static Optional<JokesCategory> parse(String input) {
        if (input.contains("random")) {
            return Optional.of(JokesCategory.RANDOM);
        } else if (input.contains("animal")) {
            return Optional.of(JokesCategory.ANIMAL);
        } else if (input.contains("career")) {
            return Optional.of(JokesCategory.CAREER);
        } else if (input.contains("celebrity")) {
            return Optional.of(JokesCategory.CELEBRITY);
        } else if (input.contains("dev")) {
            return Optional.of(JokesCategory.DEV);
        } else if (input.contains("explicit")) {
            return Optional.of(JokesCategory.EXPLICIT);
        } else if (input.contains("fashion")) {
            return Optional.of(JokesCategory.FASHION);
        } else if (input.contains("food")) {
            return Optional.of(JokesCategory.FOOD);
        } else if (input.contains("history")) {
            return Optional.of(JokesCategory.HISTORY);
        } else if (input.contains("money")) {
            return Optional.of(JokesCategory.MONEY);
        } else if (input.contains("movie")) {
            return Optional.of(JokesCategory.MOVIE);
        } else if (input.contains("music")) {
            return Optional.of(JokesCategory.MUSIC);
        } else if (input.contains("political")) {
            return Optional.of(JokesCategory.POLITICAL);
        } else if (input.contains("religion")) {
            return Optional.of(JokesCategory.RELIGION);
        } else if (input.contains("science")) {
            return Optional.of(JokesCategory.SCIENCE);
        } else if (input.contains("sport")) {
            return Optional.of(JokesCategory.SPORT);
        } else if (input.contains("travel")) {
            return Optional.of(JokesCategory.TRAVEL);
        }
        return Optional.empty();
    }

}
