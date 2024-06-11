package poo.stream_api;

import java.util.Arrays;
import java.util.List;

public class TodosNumerosIguais {
    public static void main(String[] args) {
        //Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("Quantia de numeros após remover os duplicados: " + numeros.stream().distinct().count());
    }
}
