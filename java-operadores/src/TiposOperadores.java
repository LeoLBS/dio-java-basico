public class TiposOperadores {
    public static void main(String[] args) {
        
        //Temos varios tipos de operadores sendo eles: 

            //Operador de atribuição sendo ele "=":

            int numeroUm = 1;
            String nome = "Leonardo";
            boolean recebeDinheiro = false;

            //Operadores aritméticos sendo eles (adição "+", subtração "-", multiplicação "*", divisão "/" e módulo "%"):

            int soma = 10 + 20 + 5;
            double subtração = 10.0 - 20.4 - 5.2;
            int multiplicação = 10 * 7;
            double divisão = 10.5 / 23.0;
            int resto = 10 % 2;  // Dica: podemos utilizar para descobrir numeros impares e par;



        //Concatenações:
        
            String concatenacao = "?";

            System.out.println(concatenacao);

            concatenacao = 1 + 1 + 1 + "1";

            System.out.println(concatenacao);

            concatenacao = "1" + 1 + 1 + 1;

            System.out.println(concatenacao);

            concatenacao = "1" + "1" + (1 + 1 + 1);

            System.out.println(concatenacao);
    }
}
