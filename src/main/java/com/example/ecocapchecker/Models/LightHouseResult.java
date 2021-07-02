package com.example.ecocapchecker.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)@lombok.Data@NoArgsConstructor@AllArgsConstructor
public class LightHouseResult {
    @JsonProperty("requestedUrl")
    private String requestedUrl;
    @JsonProperty("audits")
    private List<Audits> audits;

    public String getRequestedUrl() {
        return requestedUrl;
    }

    public void setRequestedUrl(String requestedUrl) {
        this.requestedUrl = requestedUrl;
    }

    public List<Audits> getAudits() {
        return audits;
    }

    public void setAudits(List<Audits> audits) {
        this.audits = audits;
    }
}
