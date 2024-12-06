package pilha;

public class EstruturaDeDadosEstatica<T> {

    protected T elementos[];
    protected int tamanho;

    EstruturaDeDadosEstatica(){
        this(10);
    }

    EstruturaDeDadosEstatica(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i =0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    protected Boolean adiciona(T elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected Boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
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
