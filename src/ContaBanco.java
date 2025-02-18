import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Vamos cadastrar seus dados ao nosso banco!");
        System.out.print("Por favor, digite o número da sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, digite a agência da sua conta: ");
        agencia = scanner.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o saldo que você gostaria de inserir na sua conta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
