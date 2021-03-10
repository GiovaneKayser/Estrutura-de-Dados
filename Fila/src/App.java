package Fila.src;
import Fila.src.service.Fila;

public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila(4);
        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);
        fila.adicionar(4);
        fila.remover();//  [2,3,4]
        fila.remover();// [3,4]
        System.out.println("primeiro" + fila.getPrimeiro());
        System.out.println("ultimo" + fila.getUltimo());
        System.out.println(fila.toString());
    }
}
