package Fila.src.service;

public class Fila {
    private int dados[];
    private int tamanho =0;
    private int primeiro = 0, ultimo = -1, tamanhoMaximo=0;                                                                                                                                                                
    

    public Fila(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.dados = new int[tamanhoMaximo];
    }

    public int getPrimeiro() {
        return this.dados[this.primeiro];
    }

    public int getUltimo() {
        return this.dados[this.ultimo];
    }

    public boolean estaVazio() 
    {
        return this.ultimo == -1 ? true : false;
    }

    public boolean estaCheia() 
    {
        return this.ultimo == tamanhoMaximo - 1 ? true : false;
    }

    public void remover() 
    {
        if (estaVazio() == true) {
            if (this.primeiro == this.tamanhoMaximo - 1) {//evitar que primeiro seja igual a -1
                this.primeiro = 0;
            } else {
                this.primeiro++;
            }
        } else {
            this.primeiro++;
            this.tamanho--;
        }
    }
    public void adicionar(int dado) 
    {
        if (estaCheia() == false) {
            if (estaVazio() == true) {
                this.ultimo = 0;
            } else {
                this.ultimo++;
            }
            this.dados[this.ultimo] = dado;
            this.tamanho++;
        } else {
            System.out.println("A lista esta cheia!!");
        }
    }

    public String toString() 
    {
        String result = "";
        for (int i = this.primeiro; i != this.ultimo + 1; i++) {
            result = result + " " +this.dados[i];
        }
        return result;
    }
}
