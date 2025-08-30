import java.util.Scanner; // Importa a classe Scanner para ler dados do terminal

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados e armazena nas variáveis
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner após ler int

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Fecha o Scanner
        scanner.close();

        // Monta a mensagem final
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque");

        // Exibe a mensagem
        System.out.println(mensagem);
    }
}