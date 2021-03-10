package Pilha.src.service;
public class Pilha{
    private String[] pilha;
    //criar pilha de tamanho x
    public Pilha(int tamanho) {
        pilha = new String[tamanho];
    }

    public String Topo() {
        return pilha[TopoIndex()];
    }

    public int TopoIndex() {
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == null) {
                return i;
            }
        }
        return pilha.length -1;
    }

    public void Adicionar(String item) {
        pilha[TopoIndex()] = item;
    }

    public void Remover() {
        pilha[TopoIndex()] = null;
    }

    public void PrintPilha() {
        for (int i = pilha.length - 1; i > -1; i--) {
            if (pilha[i] != null) {
                System.out.println(pilha[i]);
            }
            
        }
    }
}
