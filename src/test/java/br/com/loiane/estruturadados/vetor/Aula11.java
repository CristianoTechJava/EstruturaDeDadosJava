package br.com.loiane.estruturadados.vetor;

import br.com.loiane.estrutura.vetor.teste.VetorObjetos;

public class Aula11 {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(10);

        vetor.adiciona(1);
        vetor.adiciona("Cristiano");

        System.out.println(vetor);
    }
}
