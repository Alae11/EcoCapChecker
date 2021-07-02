package com.example.ecocapchecker.services.ExternalAPI;


import com.example.ecocapchecker.Models.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;


@Service
public class ClientGoogleApi {

    @Autowired
    private RestTemplate restTemplate;
    private static String URL="https://pagespeedonline.googleapis.com/pagespeedonline/v5/runPagespeed?url=";
    private static String key="AIzaSyCF3XE33Xhbexqun-BAoTxzS3BgL__glq0";
    public Response sendRequest(String url) throws Exception{
        HttpHeaders headers=new HttpHeaders();
        ObjectMapper mapper = new ObjectMapper();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity =new HttpEntity<>("parameters",headers);
        ResponseEntity<Response> response=restTemplate.exchange(URL+url+"?key="+key, HttpMethod.GET, entity, new ParameterizedTypeReference<Response>() {
        });
        String jsonStr = mapper.writeValueAsString(response.getBody());
        return response.getBody() ;
    }
}
