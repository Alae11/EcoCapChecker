package com.example.ecocapchecker.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data@NoArgsConstructor@AllArgsConstructor
public class UrlDTO implements Serializable {

    private Long id;
    private String name;
    private Long applicationId;
}
