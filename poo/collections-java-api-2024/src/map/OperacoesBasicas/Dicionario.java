package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionário vazio.");
        }
    }
    
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public void pesquisarPorPalavra(String palavra){
        String pesquisaPorPalavra = null;
        if (!dicionarioMap.isEmpty()){
            pesquisaPorPalavra = dicionarioMap.get(palavra);
        }
        System.out.println(pesquisaPorPalavra);
    }
    
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Braço", "cada um dos dois membros superiores do homem e dos quadrúmanos, que vão do ombro, com o qual se articulam, à mão.");
        dicionario.adicionarPalavra("Parafuso", "peça cônica ou cilíndrica, estriada em hélice, que se embute girando, seja em outra peça (porca) atarraxada em sentido contrário, seja num meio resistente, por efeito combinado de rotação e pressão.");
        dicionario.adicionarPalavra("Telhado", "conjunto das telhas que cobrem um edifício.");
        dicionario.adicionarPalavra("Cachorro", "cão novo e pequeno.");
        dicionario.adicionarPalavra("Queijo", "produto obtido pela fermentação da coalhada, submetida à compressão e posta a secar no cincho.");
        dicionario.adicionarPalavra("Chuva", "fenômeno que resulta da condensação do vapor de água da atmosfera em pequenas gotas que, quando atingem peso suficiente, se precipitam sobre o solo.");

        dicionario.exibirPalavras();
        
        dicionario.removerPalavra("Parafuso");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Queijo");
    }
}
