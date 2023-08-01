package com.example.getupandgoairlinereservationsystem.controller;

import com.example.getupandgoairlinereservationsystem.service.PortService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@AllArgsConstructor
@Data
@Builder
@RequestMapping("/api/portName")
public class PortController {

    public final PortService portService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add() throws IOException {

        portService.addData();
    }

}
