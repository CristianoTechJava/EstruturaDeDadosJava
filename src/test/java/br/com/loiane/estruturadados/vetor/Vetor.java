package br.com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//    public void adiciona(String elemento){
//        for(int i = 0; i  < this.elementos.length; i++){
//            if(this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void adiciona(String elemento) throws Exception {
//
//        if(this.tamanho < this.elementos.length){
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        }else {
//            throw new Exception("Vetor já está cheio, não é posssível adicionar mais elementos");
//        }
//
//
//    }

    public Boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        return false;
    }

    public Boolean adiciona(int posicao, String elemento){
        //validar uma posição válida
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicação inválida");
        }

        //vamos agora começar a mover os elementos
        for(int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        //atribuir os elementos para posição
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int poisicao) {

        if (!(poisicao >= 0 && poisicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[poisicao];
    }

    public int busca(String elemento) {

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.elementos[i]);
            sb.append(",");
        }

        if (this.tamanho > 0) {
            sb.append((this.elementos[this.tamanho - 1]));
        }
        sb.append("]");

        return sb.toString();
    }
}
