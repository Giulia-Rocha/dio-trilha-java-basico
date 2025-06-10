import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner s = new Scanner(System.in);

        System.out.println("---- Seja-bem vindo(a) ---- \n");
        System.out.println("Por favor digite o número da agencia:");
        agencia = s.nextLine();
        System.out.println("Digite o numero da conta:");
        numero = s.nextInt();
        s.nextLine();
        System.out.println("Digite seu nome:");
        nomeCliente = s.nextLine();
        System.out.println("Digite seu quando deseja depositar:");
        saldo= s.nextDouble();
        System.out.println("Olá "+nomeCliente+" ,obrigado por criar uma conta em nosso banco!\nSua Agencia é "+
                agencia+" conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque");

    }
}
