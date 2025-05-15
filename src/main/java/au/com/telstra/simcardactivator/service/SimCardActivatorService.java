package au.com.telstra.simcardactivator.service;

import au.com.telstra.simcardactivator.controller.dto.SimCardDto;
import au.com.telstra.simcardactivator.repository.SimCardActivatorRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SimCardActivatorService {

    private final SimCardActivatorRepository simCardActivatorRepository;

    public SimCardActivatorService(SimCardActivatorRepository simCardActivatorRepository) {
        this.simCardActivatorRepository = simCardActivatorRepository;
    }

    public ResponseEntity<Object> activate(SimCardDto simCardDto) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<SimCardDto> request = new HttpEntity<>(simCardDto, headers);

        String response = restTemplate.postForEntity("http://localhost:8444/actuate", request, String.class).getBody();

        return ResponseEntity.ok(response);
    }
}
