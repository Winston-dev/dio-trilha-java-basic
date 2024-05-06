import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o numero da Agencia!");
        String agencia = scan.next();

        System.out.println("Usuario: ");
        int numeroConta = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Por favor digite o nome do Cliente!");
        String nomeCliente = scan2.nextLine();

        System.out.println("Saldo");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " +
                saldo
                + " já está disponível para saque.");

    }
}
