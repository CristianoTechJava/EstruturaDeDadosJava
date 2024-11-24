package br.com.loiane.estruturadados.vetor;

import br.com.loiane.estrutura.vetor.teste.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);


        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

    }
}
