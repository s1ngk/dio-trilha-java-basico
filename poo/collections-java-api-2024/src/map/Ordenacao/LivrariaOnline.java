package map.Ordenacao;

import java.util.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline(){
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livros.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livros.remove(chave);
        }   
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }
    
    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdernarPorAutor = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosParaOrdernarPorAutor, new ComparatorPorAutor());
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdernarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }

    public String obterLivroMaisCaro(){
        Double valorLivroMaisCaro = 0d;
        String livroMaisCaro = null;
        List<Map.Entry<String, Livro>> listaLivroMaisCaro = new ArrayList<>(livros.entrySet());
        for (Map.Entry<String, Livro> entry : listaLivroMaisCaro){  
            if (entry.getValue().getPreco() > valorLivroMaisCaro){
                livroMaisCaro = entry.getValue().getTitulo();
            }
        }
        return livroMaisCaro;

    }

    public String exibirLivroMaisBarato(){
        Double valorLivroMaisBarato = 10000.00;
        String livroMaisBarato = null;
        List<Map.Entry<String, Livro>> listaLivroMaisBarato = new ArrayList<>(livros.entrySet());
        for (Map.Entry<String, Livro> entry : listaLivroMaisBarato){  
            if (entry.getValue().getPreco() < valorLivroMaisBarato){
                livroMaisBarato = entry.getValue().getTitulo();
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println(livrariaOnline.exibirLivroMaisBarato());

        System.out.println(livrariaOnline.obterLivroMaisCaro());

        livrariaOnline.removerLivro("E Não Sobrou Nenhum");

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
    }
}
