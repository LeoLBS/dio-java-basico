public class ResultadoEscolar {

    public static void main(String[] args) {
        int notaAluno = 5;

        if(notaAluno >= 7){
            System.out.println("Aprovado");
        }
        else if(notaAluno >= 5 && notaAluno < 7){
            System.out.println("Recuperação!");
        }
        else{
            System.out.println("Reprovado!!");
        }

    }
}
