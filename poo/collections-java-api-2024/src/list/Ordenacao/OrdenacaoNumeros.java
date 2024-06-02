import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;
    
    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    } 

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenaNumeros = new OrdenacaoNumeros(); 
        ordenaNumeros.adicionarNumero(5);
        ordenaNumeros.adicionarNumero(3);
        ordenaNumeros.adicionarNumero(4);
        ordenaNumeros.adicionarNumero(8);
        ordenaNumeros.adicionarNumero(13);
        ordenaNumeros.adicionarNumero(-2);
        ordenaNumeros.adicionarNumero(0);

        System.out.println("Ordenaçao Ascendente: " + ordenaNumeros.ordenarAscendente());

        System.out.println("Ordenaçao Descendente: " + ordenaNumeros.ordenarDescendente());

        ordenaNumeros.exibirNumeros();
    }

}
