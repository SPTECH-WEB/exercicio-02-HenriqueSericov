package com.example.atividade1_s2.Service;

import org.springframework.stereotype.Component;

@Component("entregaExterna")
public class EntregaExterna{
    public Double calcularEntregaExterna(double peso) {
       return peso * 1.8 + 5;
    }

    public String modalidade() {
        return "Entrega Externa";
    }
}

