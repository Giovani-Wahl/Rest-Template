package com.giovaniwahl.RestTemplate.consultacep;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaCepService {
    public CepResultDTO  consultaCep(String cep){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CepResultDTO> resultDTO = restTemplate.getForEntity(String.format("https://viacep.com.br/ws/%s/json/",cep),CepResultDTO.class);
        return resultDTO.getBody();
    }
}
