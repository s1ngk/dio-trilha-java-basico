package poo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosDistintos {
    public static void main(String[] args) {
        //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros2 = numeros.stream().distinct().collect(Collectors.toList());
        Boolean distintos = numeros2.equals(numeros);
        System.out.println("Lista possui numeros distintos? " + !distintos);
    }
}
