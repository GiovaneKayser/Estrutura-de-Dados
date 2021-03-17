package ArrayMatrizes.src.service;

public class ArrayDinamico {
    public ArrayDinamico(int tamanho) {
        this.contatos = new Contato[tamanho];
    }

    private class Contato {
        private String numero;
        private String nome;

        public Contato(String numero, String nome) {
            this.nome = nome;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

    private Contato[] contatos;

    public void adicionar(String numero, String nome) {
        Contato contato = new Contato(numero, nome);
        int i = 0;
        while (i < contatos.length) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                break;
            }
            i++;
        }
    }

    public void remover(String numero, String nome) {
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null){
                if (contatos[i].nome.equals(nome)) {
                    contatos[i] = null;
                    break;
                }
                
            }
        }
    }

    public String toString() {
        String resultado = "";
        for (Contato contato : contatos) {
            if (contato != null)
                resultado = resultado + "Nome: " + contato.nome + " Numero: " + contato.numero + "\n";
            
        }
        return resultado;
    }

}