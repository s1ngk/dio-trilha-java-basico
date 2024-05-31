package Servicos.Musica;

public class Reprodutor implements reprodutorMusical {
    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    }
    public void pausar(){
        System.out.println("PAUSANDO MUSICA");
    }
    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MUSICA " + musica);
    }

}
