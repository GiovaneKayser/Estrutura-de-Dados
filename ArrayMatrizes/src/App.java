package ArrayMatrizes.src;

import ArrayMatrizes.src.service.ArrayDinamico;
import ArrayMatrizes.src.service.Matematica;

public class App {
    public static void main(String[] args) throws Exception {
        int[] lista = {1,1,2,3,4,4,5,4};
        System.out.println(Matematica.Moda(lista));
        System.out.println(Matematica.Media(lista));
        System.out.println("______________");
        ArrayDinamico contatos = new ArrayDinamico(100);
        contatos.adicionar("1111", "teste1");
        contatos.adicionar("1112", "teste2");
        contatos.adicionar("1113", "teste3");
        contatos.adicionar("1114", "teste4");
        contatos.remover("1111", "teste1");
        System.out.println(contatos.toString());
    }
}
