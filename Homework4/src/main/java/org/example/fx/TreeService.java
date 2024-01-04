package org.example.fx;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import org.example.Tree;

public class TreeService {
    private final String serverBaseUrl;

    public TreeService(String serverBaseUrl) {
        this.serverBaseUrl = serverBaseUrl;
    }

    public List<Tree> getAllTrees() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Tree>> response = restTemplate.exchange(
                serverBaseUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Tree>>() {}
        );

        return response.getBody();
    }

    // Другие методы для взаимодействия с сервером
}
