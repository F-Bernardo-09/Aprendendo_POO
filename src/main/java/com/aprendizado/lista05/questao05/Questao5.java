package com.aprendizado.lista05.questao05;

import java.util.ArrayList;
import java.util.List;

public class Questao5 {
    public static void main(String[] args) {
        List<Imprimivel> documentos = new ArrayList<>();

        documentos.add(new RelatorioFinanceiro());
        documentos.add(new Contrato());
        documentos.add(new RelatorioFinanceiro());

        for (Imprimivel doc : documentos){
            doc.imprimir();

            if (doc instanceof EnviavelPorEmail){
                EnviavelPorEmail enviavel = (EnviavelPorEmail) doc;
                enviavel.enviar("teste@gmail.com");
            }
        }
    }
}
