package com.example.getupandgoairlinereservationsystem.controller;
import com.example.getupandgoairlinereservationsystem.apiClasses.ApiResponseDto;
import com.example.getupandgoairlinereservationsystem.client.ApiClient;
import com.example.getupandgoairlinereservationsystem.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final ApiClient apiClient;
    private final ApiService apiService;

    @GetMapping(value = "/fly")
    public ResponseEntity<ApiResponseDto> searchInfo() {

        return apiService.apiAll();

    }
}
