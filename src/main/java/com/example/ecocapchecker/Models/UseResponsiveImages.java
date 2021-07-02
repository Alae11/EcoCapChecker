package com.example.ecocapchecker.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)@NoArgsConstructor
@AllArgsConstructor
@Data
public class UseResponsiveImages extends DataApi{
}
