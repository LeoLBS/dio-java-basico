public class BoletimEscolar {
    public static void main(String[] args) {
        double mediaFinal = 6.0;

        if (mediaFinal >= 6.0){
            System.out.println("APROVADO!! Com a nota: " + mediaFinal);
        }
        else if (mediaFinal < 6.0) {
            System.out.println("REPROVADO!! Com a nota: " + mediaFinal);
        }
        else{
            System.out.println("VARIAVEL NULA!");
        }
    }
}
