import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int saldo = 10;

        System.out.println("Por favor, nos informe o seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta!");
        int conta = scanner.nextInt();

        System.out
                .println("Senhor(A) " + nome + " verificamos em nosso sistema que em sua conta de Agência: " + agencia +
                        " e conta: " + conta + " Que o seu saldo está em: R$" + saldo);

    }
}
