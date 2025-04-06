package com.example.atividade1_s2.Service;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso * 2.0+10;
    }

    @Override
    public String modalidade() {
        return "Entrega Expressa";
    }
}
