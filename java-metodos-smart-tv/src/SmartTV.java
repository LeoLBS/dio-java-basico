public class SmartTV {

     boolean ligada = false;
     int canal = 15;
     int volume = 20;

    //Trabalhando com metodos:
    
     public void ligarTv(){ 
        ligada = true;
     }
     public void desligarTV(){
        ligada = false;
     }

     public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
     }

     public void diminuirVolume(){
        volume--;
        System.out.println("Diminuido o volume para: " + volume);
     }

     public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
     }
     public void diminuirCanal(){
        canal--;
        System.out.println("Diminuido o canal para: " + canal);
     }
     public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Alterando o canal para: " + canal);
     }
}
