package br.com.loiane.exerciciosVetor;


public class VetorExerc<T> {

    private int tamanho;
    private T[] elementos;

    public VetorExerc(int campacidade) {

        this.elementos = (T[]) new Object[campacidade];
        this.tamanho = 0;
    }

    public void adiciona(T elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    public boolean contains(T elemento) {
        boolean result = false;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                result = true;
            }
        }
        return result;
    }

    public int ultimoIndice(T elemento) {
        int ultimaPos = -1;
        for (int i = this.tamanho-1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(T elemento){

        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                this.elementos[i] = this.elementos[i+1];
            }
        }

    }


}
