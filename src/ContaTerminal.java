import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Bem vindo ao Banco Digital Faraós!");
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o Número da conta(somente os números): ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Parabéns, sua conta foi criada com sucesso!, novos clientes recebem um bônus\n de R$ 100,00 para começar a usar sua conta digital!");
       double saldo = 100.00;
        System.out.println("Criando conta para " + nomeCliente + " Seu número de conta é " + numeroConta + " e sua agência é " + agencia + "\nseu saldo disponivel para saque é de R$ " + saldo);
        
        System.out.println("Obrigado por criar sua conta conosco, " + nomeCliente + "! Estamos ansiosos para atendê-lo e ajudá-lo a alcançar seus objetivos financeiros!");
        scanner.close();



    }
} 
