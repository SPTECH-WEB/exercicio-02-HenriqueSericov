package com.example.atividade1_s2.Service;

import org.springframework.stereotype.Service;

@Service("EntregaExterna")
public class EntregaAdapter implements FreteStrategy{
    private final EntregaExterna entregaExterna;

    public EntregaAdapter() {
        this.entregaExterna = new EntregaExterna();
    }

    @Override
    public String modalidade(){
        return "Entrega Externa";
    }

    @Override
    public double calcular(double peso){
        return entregaExterna.calcularEntregaExterna(peso);
    }
}
