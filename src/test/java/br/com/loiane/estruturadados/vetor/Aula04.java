package br.com.loiane.estruturadados.vetor;

import br.com.loiane.estrutura.vetor.teste.Vetor;

public class Aula04 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println( vetor.tamanho());
        System.out.println(vetor);

    }
}
