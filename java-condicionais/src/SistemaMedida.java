public class SistemaMedida {
    public static void main(String[] args) {
        String medida = "M";

        switch(medida){

            case "P":{
                System.out.println("Medida: " + medida);
                break;
            }
            case "M":{
                System.out.println("Medida: " + medida);
                break;
            }
            case "G": {
                System.out.println("Medida: " + medida);
                break;
            }    
            default:
                System.out.println("Indefinido");
        }    
    }
}
