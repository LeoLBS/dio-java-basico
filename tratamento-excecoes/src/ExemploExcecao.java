import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");
        //System.out.println(valor);

        try {
            Number segundoValor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(segundoValor);
        } catch (ParseException e) {
            System.out.println("Só pode ser convertido caso tenha números!!");
        }

    }
}
