import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens pro usuario
        //Obter os valores digitados no terminal pelo scanner
        System.out.println("Digite o numero de sua conta (Exemplo: 0000)");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o numero de sua agencia(Exemplo: 000-0)");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome (Exemplo: Joao Silva)");
        String nomeCliente = scanner.next();
        System.out.println("Digite o seu saldo (Exemplo: 103.48)");
        Double saldo = scanner.nextDouble();
        scanner.close();
        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}