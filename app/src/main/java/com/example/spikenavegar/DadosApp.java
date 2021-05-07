package com.example.spikenavegar;

import java.util.ArrayList;
import java.util.List;

public class DadosApp {

    private List<PassoReceita> receita;
    private int posicao;
    private int total_passos;

    // singleton
    public DadosApp() {
        receita = new ArrayList<>();
        receita.add(new PassoReceita("Passo 1", ""));
        receita.add(new PassoReceita("Passo 2", ""));

        posicao = 1;
        total_passos = receita.size();
    }

    public String getTextoPassoReceita() {
        return receita.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < total_passos)
            posicao++;
    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {
        receita.get(posicao - 1).setFeito(true);
    }
}
