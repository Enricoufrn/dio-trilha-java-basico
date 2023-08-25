import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criando uma conta...");
        Conta conta = new Conta();
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        conta.setNumero(numero);
        System.out.println("Digite a agência da conta:");
        String agencia = scanner.next();
        scanner.nextLine();
        conta.setAgencia(agencia);
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        conta.setNomeCliente(nomeCliente);
        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        conta.setSaldo(new BigDecimal(saldo));
        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
        scanner.close();
    }
}