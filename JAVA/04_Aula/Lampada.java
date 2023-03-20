public class Lampada {

    boolean estadoLampada;

    void acender(){
        estadoLampada = true; 
    }
    void apagar(){
        estadoLampada = false;

    }
    boolean obterEstado(){
        return estadoLampada; 
    }

}
