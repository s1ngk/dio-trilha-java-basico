package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavras.isEmpty()) {
            if (palavras.contains(palavra)) {
              palavras.remove(palavra);
            } else {
              System.out.println("Palavra não encontrada.");
            }
          } else {
            System.out.println("Conjunto vazio.");
          }
    }

    public void verificarPalavra(String palavra){
        if (!palavras.isEmpty()){
            if (palavras.contains(palavra)){
                System.out.println("O conjunto contém a palavra: " + palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto.");
            }
        } else {
            System.out.println("Conjunto vazio.");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Banana");
        conjuntoPalavrasUnicas.adicionarPalavra("Banana");
        conjuntoPalavrasUnicas.adicionarPalavra("Maçã");
        conjuntoPalavrasUnicas.adicionarPalavra("Pera");
        conjuntoPalavrasUnicas.adicionarPalavra("Abóbora");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Banana");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Maçã");
        conjuntoPalavrasUnicas.verificarPalavra("Banana");

    }
}
