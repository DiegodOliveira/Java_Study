package conta.interativa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do titular da conta: ");
        String titular = scanner.nextLine();
        Conta conta = new Conta(titular);

        System.out.println("Informe o valor a ser depositado: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.println("Informe o valor a ser sacado: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        System.out.print("O saldo final é de R$"+conta.getSaldo());
    }
}
