package br.com.loiane.estruturadados.vetor;

import br.com.loiane.estrutura.vetor.teste.Vetor;

public class Aula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca(2));


    }
}
