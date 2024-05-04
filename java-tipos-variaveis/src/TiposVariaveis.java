public class TiposVariaveis {
    public static void main(String[] args) {
        //Tipos primitivos e o seus valores máximos, tanto negativo como positivo:

        byte numeroByte = -128; 
        numeroByte = 127;  

        short numeroShort = -32768;
        numeroShort = 32767;

        int numeroInt = -2147483648;
        numeroInt = 2147483647;

        long numeroLong = -9223372036854775808L;
        numeroLong = 9223372036854775807L;

       
        //Tipos primitivos com partes fracionárias e o seus valores máximos, tanto negativo como positivo:

        float numeroFloat = -3.4028235e+38F;
        numeroFloat = 3.4028235e+38F;

        double numeroDouble = 1.7976931348623157e+308;
        numeroDouble = 1.7976931348623157e+308;

        //Tipos de variaveis de texto:

        String nomeString = "Leo";


        //O tipo char pode ser utilizado de duas formas, onde pode se colocar aspas simples e só uma letra ou colocar só o número que representa a letra, seguindo uma tabela que deixarei no README
          //1 Tipo:  
            char aspasLetra = 'R';
          //2 Tipo:
            char numeroLetra = 82;  


        //Variáveis do tipo constante devemos colocar a palavra final e por conta de nomenclatura colocamos o nome da variável com letras MAIÚSCULAS:

        final int NUMERO_FINAL = 2;
        // NUMERO_FINAL = 3; // NÃO PODE POIS É UMA VARIAVEL CONSTANTE
    }
}
