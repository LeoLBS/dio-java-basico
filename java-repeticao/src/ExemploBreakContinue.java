public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){

            if (numero == 3) {
                break;  // Aqui ele para todo o for
            }
            System.out.println("O numero é: " + numero);
        }

        for(int numero = 1; numero <= 5; numero ++){

            if (numero == 3) {
                continue; // Mesmo aqui ele não vai mostrar o 3, mas vai continuar
            }
            System.out.println("O numero do segundo for é: " + numero);
        }
    }
}
