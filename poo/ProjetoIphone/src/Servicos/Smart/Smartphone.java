package Servicos.Smart;

import Servicos.Musica.reprodutorMusical;
import Servicos.Navegacao.navegadorInternet;
import Servicos.Telefonia.aparelhoTelefonico;

public class Smartphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical{
    public void tocar() {
        System.out.println("TOCANDO MUSICA VIA SMARTPHONE");
    }

    public void pausar() {
        System.out.println("PAUSANDO MUSICA VIA SMARTPHONE");
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA " + musica + " VIA SMARTPHONE");
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA " + url + " VIA SMARTPHONE");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA VIA SMARTPHONE");
    }

    public void atualizarPagina() {
        System.out.println("ATUALZIANDO PAGINA VIA SMARTPHONE");
    }

    public void ligar(String numero) {
        System.out.println("REALIZANDO LIGAÇAO PARA NUMERO " + numero + " VIA SMARTPHONE");
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇAO VIA SMARTPHONE");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA SMARTPHONE");
    }
}
