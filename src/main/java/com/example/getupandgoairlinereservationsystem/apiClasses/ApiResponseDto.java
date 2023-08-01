package com.example.getupandgoairlinereservationsystem.apiClasses;

import lombok.Data;

@Data
public class ApiResponseDto {
    public int status;
    public Message message;
    public CustomData data;

}
