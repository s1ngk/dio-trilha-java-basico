package poo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosArrumado = numeros.stream().distinct().collect(Collectors.toList());
        int segundoMaior = numerosArrumado.stream().sorted().collect(Collectors.toList()).get(numerosArrumado.size()-2);
        System.out.println(numerosArrumado);
        System.out.println(segundoMaior);
    }
}   
