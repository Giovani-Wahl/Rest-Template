package com.giovaniwahl.RestTemplate.consultacep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/consulta-cep")
public class ConsultaCepAPI {
    private final ConsultaCepService consultaCepService;
    @Autowired
    public ConsultaCepAPI(ConsultaCepService consultaCepService) {
        this.consultaCepService = consultaCepService;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<CepResultDTO> consultaCep(@PathVariable String cep){
        CepResultDTO cepResultDTO = consultaCepService.consultaCep(cep);
        return ResponseEntity.status(HttpStatus.OK).body(cepResultDTO);
    }
}
