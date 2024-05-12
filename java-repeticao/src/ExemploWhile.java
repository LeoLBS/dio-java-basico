import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0 ) {
            
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;  // Não ficar zerado a mesada
            }

            System.out.println("Doce do valor R$: " + valorDoce + " Foi adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("João gastou toda a seu mesada ficando com: " + mesada);

        
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(10, 20);
    }
}