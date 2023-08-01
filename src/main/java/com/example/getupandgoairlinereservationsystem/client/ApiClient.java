package com.example.getupandgoairlinereservationsystem.client;
import com.example.getupandgoairlinereservationsystem.apiClasses.ApiResponseDto;
import com.example.getupandgoairlinereservationsystem.dto.ApiRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "fly", url = "https://search.azal.travel/buta/searchFlight")
public interface ApiClient {
    @PostMapping()
    ApiResponseDto apiResponseDto (ApiRequestDto dto);


}
