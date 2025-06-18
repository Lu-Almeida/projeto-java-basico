package ContaBanco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura de dados
        DecimalFormat df = new DecimalFormat("0.00"); // Formata o saldo com duas casas decimais

        // Solicita que o usuário digite o número da agência e armazena a resposta
        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.nextLine();

        // Solicita que o usuário digite o número da conta e armazena a resposta
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer após ler o número

        // Solicita que o usuário digite o nome do cliente e armazena a resposta
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        // Solicita que o usuário digite o saldo e armazena a resposta
        System.out.println("Por favor, digite seu saldo: ");
        float saldo = scanner.nextFloat();

        // Exibe uma mensagem final com os dados coletados do usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$ " +
                df.format(saldo) + " já está disponível para saque.");
    }
}
