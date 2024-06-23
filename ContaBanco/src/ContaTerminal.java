import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random saldoAleatorio = new Random();

        double saldo = saldoAleatorio.nextDouble(900);

        System.out.println("Por favor informe a sua conta bancaria: ");
        int numero = ler.nextInt();

        System.out.println("Informe a sua agencia: ");
        String agencia = ler.next();

        System.out.println("Informe o seu nome: ");
        String nomeCliente = ler.next();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo +  " já está disponível para saque");
        
    }
}
