package br.com.loiane.estruturadados.vetor;

public class Aula06 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println( vetor.busca("elemento 1"));
        System.out.println( vetor.busca("elemento 4"));

    }
}