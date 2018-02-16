package com.balakumar.jenkerMonitor;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.basicAuthorization("balakumarrulez","1234kuttty").build();
    }
  


    public TestBody someRestCall() {
    	
        return this.restTemplate.getForObject("http://localhost:8080/api/json?pretty=true", TestBody.class);
    }

}
