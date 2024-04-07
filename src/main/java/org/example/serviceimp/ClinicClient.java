package org.example.serviceimp;

import org.example.dto.ClinicDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClinicClient {

    @Autowired
    private RestTemplate restTemplate;

    public void createClinic(ClinicDTO clinicDTO) {
        String url = "http://localhost:8081/clinics";
        ResponseEntity<ClinicDTO> response = restTemplate.postForEntity(url, clinicDTO, ClinicDTO.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            System.out.println("Clinic created successfully: " + response.getBody());
        } else {
            System.out.println("Failed to create clinic: " + response.getStatusCode());
        }
    }
}
