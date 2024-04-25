public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarDesligar(){
        ligada = !ligada;
        System.out.println("A TV está "+(ligada?"ligada":"desligada"));
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual: "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: "+volume);
    }

    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Canal atual: "+this.canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: "+canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: "+canal);
    }

}
