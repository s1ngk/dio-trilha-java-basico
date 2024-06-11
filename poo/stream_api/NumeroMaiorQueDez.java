package poo.stream_api;

import java.util.Arrays;
import java.util.List;

public class NumeroMaiorQueDez {
    public static void main(String[] args) {
        //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Boolean maiorQueDez = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("Lista possui numero maior que 10? :" + maiorQueDez);
    }
}
