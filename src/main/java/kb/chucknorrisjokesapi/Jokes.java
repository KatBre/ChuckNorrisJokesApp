package kb.chucknorrisjokesapi;

import lombok.Data;

import java.util.List;

@Data
public class Jokes {
    private List<String> categories;
    private String created_at;
    private String icon_url;
    private String id;
    private String updated_at;
    private String url;
    private String value;
}
