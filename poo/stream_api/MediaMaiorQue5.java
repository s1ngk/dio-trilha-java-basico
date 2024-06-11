package poo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MediaMaiorQue5 {
    public static void main(String[] args) {
        //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).collect(Collectors.toList());
        int resultado = numerosMaioresQueCinco.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}
