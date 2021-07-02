package com.example.ecocapchecker.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)@NoArgsConstructor@AllArgsConstructor
public class Response {
    @JsonProperty("lighthouseResult")
    private LightHouseResult lightHouseResult;
    public LightHouseResult getLightHouseResult() {
        return lightHouseResult;
    }

    public void setLightHouseResult(LightHouseResult lightHouseResult) {
        this.lightHouseResult = lightHouseResult;
    }


}
