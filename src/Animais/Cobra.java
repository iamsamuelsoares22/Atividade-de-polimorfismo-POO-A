package Animais;
import Tipos.*;

public class Cobra extends Reptil {
    
    @Override
    public void locomover(){
        System.out.println("Eu me locomovo rastejando");
    }

    public void emitirSom(){
        System.out.println("Eu posso emitir som do tipo sibilar, silvar ou chocalhar");
    }
}
