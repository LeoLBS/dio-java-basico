public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int notaAluno = 5;

        String resultado = notaAluno >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        String resultadoAluno = notaAluno >= 7 ? "Aprovado" : notaAluno >= 5 && notaAluno < 7 ? "Recupração" : "Reprovado";

        System.out.println(resultadoAluno);
    }
}
