import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;
    
    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer n : numeroList ){
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
            if(!numeroList.isEmpty()){
                for (Integer numero : numeroList){
                    if (numero >= maiorNumero) {
                        maiorNumero = numero;
                    }
                }
                return maiorNumero;
            } else {
                throw new RuntimeException("Lista de números vazia.");
            }
        }

    public int encontrarMenorNumero(){
       int menorNumero = Integer.MAX_VALUE;
        if(!numeroList.isEmpty()){
            for (Integer numero : numeroList){
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
            } else {
                throw new RuntimeException("Lista de números vazia.");
            }
    }
    
    public void exibirNumero(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        } else {
            System.out.println("Lista vazia.");
        }
    }
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(0);
        
        System.out.println("Numeros adicionados: ");
        somaNumeros.exibirNumero();

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());

        System.out.println("Maior número da lista: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número da lista: " + somaNumeros.encontrarMenorNumero());

    }
}
