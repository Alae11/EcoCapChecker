package com.example.ecocapchecker.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data@AllArgsConstructor@NoArgsConstructor
public class ResultDTO implements Serializable {
    private Long id;
    private double score;
    private double empreinteCo2;
    private int nbRequests;
    private int nmElementDom;
    private int poidss;
    private String auditsPassed;
    private String auditsDiagnostics;
    private boolean greenHosting;
    private Date date;
    private Long urlId;
}
