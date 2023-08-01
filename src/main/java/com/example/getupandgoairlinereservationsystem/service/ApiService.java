package com.example.getupandgoairlinereservationsystem.service;

import com.example.getupandgoairlinereservationsystem.apiClasses.ApiResponseDto;
import com.example.getupandgoairlinereservationsystem.client.ApiClient;
import com.example.getupandgoairlinereservationsystem.dto.ApiRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiService {

    private final ApiClient apiClient;

    public ResponseEntity<ApiResponseDto> apiAll() {
        ApiRequestDto apiRequestDto = new ApiRequestDto();
        apiRequestDto.adultCount = 1;
        apiRequestDto.arrivalDate = "2023-08-03";
        apiRequestDto.arrivalPort = "SAW";
        apiRequestDto.childCount = 0;
        apiRequestDto.classType = "ECONOMY";
        apiRequestDto.click_id = "BDacf3d573-05ab-6350-cd63-2f12515ac34a";
        apiRequestDto.departureDate = "2023-07-18";
        apiRequestDto.departurePort = "GYD";
        apiRequestDto.directionType = "RT";
        apiRequestDto.infantCount = 0;
        apiRequestDto.isQIWI = false;
        apiRequestDto.lang = "EN";
        apiRequestDto.searchType = "NORMAL";

        ApiResponseDto flyData = apiClient.apiResponseDto(apiRequestDto);

        var doc = flyData.data.departureCityName.get(0);
        System.out.println(doc);
        var docc = flyData.data.flightsOfDeparture.get(0);
        System.out.println(docc);

        return new ResponseEntity<ApiResponseDto>(flyData, HttpStatus.OK);

    }

}
