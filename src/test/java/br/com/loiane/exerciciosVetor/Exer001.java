package br.com.loiane.exerciciosVetor;

public class Exer001 {

    public static void main(String[] args) {

        VetorExerc<String> vetor = new VetorExerc<>(5);

        vetor.adiciona("Cristano");
        vetor.adiciona("Fabiana");
        vetor.adiciona("Heitor");

        vetor.remove("Heitor");
        System.out.println(vetor.contains("Heitor"));


    }
}
