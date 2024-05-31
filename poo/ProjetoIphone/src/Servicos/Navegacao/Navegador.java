package Servicos.Navegacao;

public class Navegador implements navegadorInternet {
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PAGINA " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }

}
