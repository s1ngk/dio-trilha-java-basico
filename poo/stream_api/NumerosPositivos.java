package poo.stream_api;

import java.util.Arrays;
import java.util.List;

public class NumerosPositivos {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Boolean positivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println("Todos os valores da lista são positivos? " + positivos);
    }
}
