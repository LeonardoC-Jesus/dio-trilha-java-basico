import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        double saldo;
        String agencia;
        String nomeCliente;

        System.out.println("Bem Vindo ao seu novo Banco ;)");
        System.out.println("Permita-nos te conhecer, nos informe seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o nome da sua Agencia:");
        agencia = scanner.nextLine();
        System.out.println("Agora por gentileza, digite seu numero de Agencia:");
        numero = scanner.nextInt();
        System.out.println("Qual o seu saldo?");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco\nSua agência é " + agencia + " , conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque");


    }
}