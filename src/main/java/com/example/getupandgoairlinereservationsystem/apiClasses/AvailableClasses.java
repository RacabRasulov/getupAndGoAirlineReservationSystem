package com.example.getupandgoairlinereservationsystem.apiClasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AvailableClasses {
    @JsonProperty("S")
    public int s;
    @JsonProperty("Y")
    public int y;
    @JsonProperty("N")
    public int n;
    @JsonProperty("B")
    public int b;
    @JsonProperty("L")
    public int l;
    @JsonProperty("T")
    public int t;
    @JsonProperty("U")
    public int u;
    @JsonProperty("H")
    public int h;
    @JsonProperty("O")
    public int o;

}
