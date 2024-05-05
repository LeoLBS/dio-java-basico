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


            //Operadores unarios sendo eles (positivo "+", negativo "-", incremento "++", decremento "--" e negação/boolean "!" )

            int negativo = -10;

            int positivo = negativo * -1;   //Por padrão, quando colocamos o numero tipo o 10 ele ja é positivo sem precisar colocar o "+", mas para tornar um numero negativo em positivo temos que multiplicar por "-1"

            int incremento = 10;
                incremento++;

            int decremento = 10;
                decremento--;

            boolean verdadeiro = true;
            boolean negando = !verdadeiro;


           //Operadores ternario sendo eles ":" e "?":

           int contaNumeroUm = 10;
           int contaNumeroDois = 10;

           String resultado = contaNumeroUm == contaNumeroDois ? "Sim, são iguais" : "Não são iguais";
           

           //Operadores relacionais sendo eles (igualdade "==", diferente "!=", maior que ">", maior ou igual ">=", menor que "<", menor ou igual "<="):

           int igualUm = 1;
           int igualDois = 2;

           boolean simNao = igualUm == igualDois;
           
           simNao = igualUm != igualDois;

           simNao =  igualUm > igualDois;

           simNao = igualUm >= igualDois;

           simNao = igualUm < igualDois;

           simNao = igualUm <= igualDois;


           //Operadores logicos sendo eles (e "&&", ou "||"):

           boolean condicaoUm = true;

           boolean condicaoDois = false;

           if(condicaoUm && condicaoDois){
                System.out.println("São verdadeiras!!");
           }
           if(condicaoUm || condicaoDois){
                System.out.println("Só temos uma condição verdadeira!!");
           }

           if(condicaoUm && (10 > 5)){
                System.out.println("São as duas verdadeiras!!");
           }
           if (condicaoDois || (10 > 5)) {
                System.out.println("Uma é verdadeira!!");
           }

           
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
