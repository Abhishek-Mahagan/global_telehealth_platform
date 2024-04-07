package org.example.controller;

import org.example.dto.ClinicDTO;
import org.example.service.ClinicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/clinics")
@Api(tags = "Clinic Management")
public class ClinicController {

    @PostMapping
    @ApiOperation(value = "Create a new clinic")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Clinic created successfully"),
            @ApiResponse(code = 400, message = "Invalid input data"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    public ResponseEntity<ClinicDTO> createClinic(@RequestBody ClinicDTO clinicDTO) {
        ClinicService clinicService = null;
        ClinicDTO newClinic = clinicService.addNewClinic(clinicDTO);
        return new ResponseEntity<>(newClinic, HttpStatus.CREATED);
    }
}
