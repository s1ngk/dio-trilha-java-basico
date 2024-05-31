package Iphone;

import Servicos.Smart.Smartphone;

public class iphone {
    public static void main(String[] args) {
        String musica = "Boy George - VUKOVI";
        String numero = "4002-8922";
        String url = "web.dio.me";
        Smartphone iphone = new Smartphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica(musica);

        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}