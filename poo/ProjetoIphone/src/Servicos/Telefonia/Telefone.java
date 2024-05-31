package Servicos.Telefonia;

public class Telefone implements aparelhoTelefonico {
    public void ligar(String numero){
        System.out.println("REALIZANDO LIGACAO PARA NUMERO " + numero);
    }
    public void atender(){
        System.out.println("ATENDENDO LIGACAO");
    }
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
