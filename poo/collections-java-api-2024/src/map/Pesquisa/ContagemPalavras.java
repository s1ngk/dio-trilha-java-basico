package map.Pesquisa;

import java.util.Map;
import java.util.HashMap;
public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras(){
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
        System.out.println("Palavra '" + palavra + "' adicionada.");
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
            System.out.println("Palavra '" + palavra + "' removida.");
        } else {
            System.out.println("Contagem vazia.");
        }
    }
    
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
            if (entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Sim", 3);
        contagemPalavras.adicionarPalavra("Vitor", 5);
        contagemPalavras.adicionarPalavra("Biscoito", 2);
        contagemPalavras.adicionarPalavra("Concordo", 7);
        contagemPalavras.adicionarPalavra("Parana", 4);
        contagemPalavras.adicionarPalavra("Queijo", 3);
        contagemPalavras.adicionarPalavra("Mulher", 9);

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
        
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente() + " é a palavra mais frequente.");

        contagemPalavras.removerPalavra("Mulher");

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente() + " é a palavra mais frequente.");

    }
}

