package kb.chucknorrisjokesapi;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiParameters {
    private long numberOfJokes;
    private JokesCategory category;

}
