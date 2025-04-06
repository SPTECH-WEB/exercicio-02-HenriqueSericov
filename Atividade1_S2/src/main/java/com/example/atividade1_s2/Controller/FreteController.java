package com.example.atividade1_s2.Controller;

import com.example.atividade1_s2.Service.FreteService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {

    private final FreteService freteService;

    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping
    public String calcularFrete(@RequestParam String modalidade, @RequestParam Double peso) {
        double valor = freteService.calcular(modalidade, peso);
        return String.format("O valor do frete da modalidade " + modalidade + " é : R$ %.2f", valor);
    }
}
