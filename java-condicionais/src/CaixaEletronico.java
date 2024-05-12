public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo =19.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Nosso saldo é de: " + saldo);
        }
        else{
            System.out.println("Você tem um saldo menor que o solicitado para sacar, sendo ele de: " + saldo);
        }

    }
}
