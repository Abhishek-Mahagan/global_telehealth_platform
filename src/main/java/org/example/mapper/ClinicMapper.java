package org.example.mapper;

import org.example.dto.ClinicDTO;
import org.example.entity.Clinic;

import java.util.Date;

// ClinicMapper.java - Mapper
public class ClinicMapper {
    public static Clinic mapToClinic(ClinicDTO clinicDTO) {
        Clinic clinic = new Clinic();
        clinic.setClinicName(clinicDTO.getClinicName());
        clinic.setBusinessName(clinicDTO.getBusinessName());
        clinic.setStreetAddress(clinicDTO.getStreetAddress());
        clinic.setCity(clinicDTO.getCity());
        clinic.setState(clinicDTO.getState());
        clinic.setCountry(clinicDTO.getCountry());
        clinic.setZipCode(clinicDTO.getZipCode());
        clinic.setLatitude(clinicDTO.getLatitude());
        clinic.setLongitude(clinicDTO.getLongitude());
        clinic.setDateCreated(new Date()); // Set current date as default
        // Map servicesOffered if needed
        return clinic;
    }
}
