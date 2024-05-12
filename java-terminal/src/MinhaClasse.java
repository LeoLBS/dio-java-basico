import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, fui executado pelo terminal!!");

        int numero = 10;

        System.out.println(numero);
    }
}
