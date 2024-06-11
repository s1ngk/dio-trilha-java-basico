package poo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomaQuadrados {
    public static void main(String[] args) {
        //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosQuadrado = numeros.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(numerosQuadrado.stream().reduce(0, Integer::sum));
    }
}
