package org.sid.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.sid.dto.Credential;
import org.sid.dto.UserResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class CheckRTAServiceImpl implements CheckRTAService {
    private RestTemplate restTemplate;

    public CheckRTAServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public UserResponse loadUSerResponse(Credential credential) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        //headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBasicAuth("SAPHIR", "sP;98Mli");
        // Créez le corps de la requête avec le login et le mot de passe
        ObjectMapper objectMapper=new ObjectMapper();
        String requestBody = null;
        requestBody = objectMapper.writeValueAsString(credential);

        HttpEntity<String> entity = new HttpEntity<String>(requestBody, headers);
       // String responseRTA=restTemplate.exchange("http://172.22.15.31:8090/RTA/RTA_API/api/connect", HttpMethod.POST, entity, String.class).getBody();
        UserResponse userResponse;
       // JsonNode jsonNode=objectMapper.readTree(responseRTA);
       // JsonNode dataArray=jsonNode.get("Data");
     //   userResponse=objectMapper.treeToValue(dataArray.get(0),UserResponse.class);
       // System.out.println(userResponse);

       // return userResponse;
        return new UserResponse( 100000523,"894","AIT SALEH OUHAJ","LOUBNA","98177",3114407,6257,50,"Responsable BC Mandataire",13,"10.213.1.0");
    }
}
