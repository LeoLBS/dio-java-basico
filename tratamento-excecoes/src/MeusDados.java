import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class MeusDados {
    public static void main(String[] args) {
     
        try{
            Scanner ler = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Qual o seu nome: ");
            String nome = ler.next();

            System.out.println("Qual o seu sobrenome: ");
            String sobrenome = ler.next();
        
            System.out.println("Qual a sua idade: ");
            int idade = ler.nextInt();

            System.out.println("Qual a sua altura: ");
            double altura = ler.nextDouble();


            System.out.println("Seu nome é: " + nome.toUpperCase() + " " + sobrenome + ", sua idade é: " + idade + ", sua altura:" + altura);
            ler.close();
        }
        catch(InputMismatchException e){
            System.out.println("A idade tem que utilizar somente números e a altura somente . exemplo: (1.75)");
        }
    }
}
