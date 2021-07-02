package com.example.ecocapchecker.controller;

import com.example.ecocapchecker.Models.Audits;
import com.example.ecocapchecker.Models.LightHouseResult;
import com.example.ecocapchecker.Models.Response;
import com.example.ecocapchecker.services.ExternalAPI.ClientGoogleApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class GoogleSpeedController {
    @Autowired
    private ClientGoogleApi clientGoogleApi;

    @GetMapping("/pageSpeed")
    public Response getGoogleResponse(@RequestParam("url") String url) throws Exception{
        return this.clientGoogleApi.sendRequest(url) ;
    }

}
