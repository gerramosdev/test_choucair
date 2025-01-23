package german.ramos.perez.orange.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class EsperaImplicita implements Interaction {
    private int segundos;

    public EsperaImplicita(int segundos) {
        this.segundos = segundos*1000;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Thread.sleep(segundos);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static EsperaImplicita seg(int segundos){
        return new EsperaImplicita(segundos);
    }
}
