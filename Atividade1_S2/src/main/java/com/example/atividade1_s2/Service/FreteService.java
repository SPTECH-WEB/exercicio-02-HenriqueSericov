package com.example.atividade1_s2.Service;

import com.example.atividade1_s2.Service.FreteStrategy;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;

    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String modalidade, double peso) {
        return estrategias.stream()
                .filter(e -> e.modalidade().equals(modalidade))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Modalidade de entrega não encontrado: " + modalidade))
                .calcular(peso);
    }
}
