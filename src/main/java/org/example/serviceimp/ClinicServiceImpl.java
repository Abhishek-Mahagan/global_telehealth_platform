package org.example.serviceimp;

import org.example.dto.ClinicDTO;
import org.example.service.ClinicService;
import org.springframework.stereotype.Service;

// ClinicServiceImpl.java - Service Implementation
@Service
public class ClinicServiceImpl implements ClinicService {
    @Override
    public ClinicDTO addNewClinic(ClinicDTO clinicDTO) {
        // Implementation to add a new clinic
        return clinicDTO;
    }
}
