package com.example.atividade1_s2.Service;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements FreteStrategy {
   @Override
    public double calcular(double peso){
       return peso * 1.3;
   }

   @Override
    public String modalidade() {
       return "Entrega Economica";
   }

}
