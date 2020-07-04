package kb.chucknorrisjokesapi;

import java.util.Optional;

public enum JokesCategory {
    RANDOM("1"),
    ANIMAL("2"),
    CAREER("3"),
    CELEBRITY("4"),
    DEV("5"),
    EXPLICIT("6"),
    FASHION("7"),
    FOOD("8"),
    HISTORY("9"),
    MONEY("10"),
    MOVIE("11"),
    MUSIC("12"),
    POLITICAL("13"),
    RELIGION("14"),
    SCIENCE("15"),
    SPORT("16"),
    TRAVEL("17");
    private String categoryNumber;

    JokesCategory(String categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getCategoryNumber() {
        return categoryNumber;
    }

    public static Optional<JokesCategory> parse(String input) {
        if (input.contains("1")) {
            return Optional.of(JokesCategory.RANDOM);
        } else if (input.contains("2")) {
            return Optional.of(JokesCategory.ANIMAL);
        } else if (input.contains("3")) {
            return Optional.of(JokesCategory.CAREER);
        } else if (input.contains("4")) {
            return Optional.of(JokesCategory.CELEBRITY);
        } else if (input.contains("5")) {
            return Optional.of(JokesCategory.DEV);
        } else if (input.contains("6")) {
            return Optional.of(JokesCategory.EXPLICIT);
        } else if (input.contains("7")) {
            return Optional.of(JokesCategory.FASHION);
        } else if (input.contains("8")) {
            return Optional.of(JokesCategory.FOOD);
        } else if (input.contains("9")) {
            return Optional.of(JokesCategory.HISTORY);
        } else if (input.contains("10")) {
            return Optional.of(JokesCategory.MONEY);
        } else if (input.contains("11")) {
            return Optional.of(JokesCategory.MOVIE);
        } else if (input.contains("12")) {
            return Optional.of(JokesCategory.MUSIC);
        } else if (input.contains("13")) {
            return Optional.of(JokesCategory.POLITICAL);
        } else if (input.contains("14")) {
            return Optional.of(JokesCategory.RELIGION);
        } else if (input.contains("15")) {
            return Optional.of(JokesCategory.SCIENCE);
        } else if (input.contains("16")) {
            return Optional.of(JokesCategory.SPORT);
        } else if (input.contains("17")) {
            return Optional.of(JokesCategory.TRAVEL);
        }
        return Optional.empty();
    }

}
