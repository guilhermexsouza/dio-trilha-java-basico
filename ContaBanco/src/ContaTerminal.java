import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta sem barra: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
