package kb.chucknorrisjokesapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


@Log4j
public class JokesApi {
    private final static String API_ENDPOINT = "https://api.chucknorris.io/jokes/random?category={category}";

    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<String> requestJokes(ApiParameters parameters) {
        String requestURL = prepareRequestURL(parameters);
        log.info("Request URL: " + requestURL);
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(requestURL))
                .build();

        List<String> listOfJokes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        log.info("How many jokes you want?");
        int jokesNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < jokesNumber; i++) {
            try {
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == 200) {
                    String responseBody = response.body();
                    Jokes jokes = objectMapper.readValue(responseBody, Jokes].class);
                    listOfJokes.add(jokes.getValue());
                } else {
                    log.error("Error: " + response.statusCode());
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        return listOfJokes;
    }

    private String prepareRequestURL(ApiParameters parameters) {
        if (parameters.getCategory().equals("random")) {
            return API_ENDPOINT
                    .replaceAll("random?category=\\{category\\}", parameters.getCategory().getCategoryName());
        } else {
            return API_ENDPOINT
                    .replaceAll("\\{category\\}", parameters.getCategory().getCategoryName());
        }
    }


}

