package Pilha.src;
import Pilha.src.service.Pilha;
public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(3);
        pilha.Adicionar("a");
        pilha.Adicionar("b");
        pilha.Adicionar("c");
        pilha.Remover();
        pilha.Adicionar("d");
        pilha.PrintPilha();
    }
}
