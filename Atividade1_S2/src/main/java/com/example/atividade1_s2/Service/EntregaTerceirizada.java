package com.example.atividade1_s2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntregaTerceirizada implements FreteStrategy {
    @Override
    public double calcular(double peso){
        return peso * 1.5;
    }

    @Override
    public String modalidade() {
        return "Entrega Terceirizada";
    }
}
