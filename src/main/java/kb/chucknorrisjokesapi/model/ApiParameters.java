package kb.chucknorrisjokesapi.model;

import kb.chucknorrisjokesapi.model.JokesCategory;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiParameters {
    private long numberOfJokes;
    private JokesCategory category;

}
