public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV(); //Novo objeto

        System.out.println("Tv nesse momento esta? " + smartTV.ligada);
        System.out.println("Canal atual da TV? " + smartTV.canal);
        System.out.println("Volume atual da TV? " + smartTV.volume);

        smartTV.ligarTv();
        System.out.println("O estado atual da Tv é de: " + smartTV.ligada);

        smartTV.desligarTV();
        System.out.println("O estado atual da TV é de: " +smartTV.ligada);

        smartTV.ligarTv();
        System.out.println("O estado atual da TV é de: " +smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();

        smartTV.mudarCanal(5);


    }
}
