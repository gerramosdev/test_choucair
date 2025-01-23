package german.ramos.perez.orange.questions;

import german.ramos.perez.orange.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarMensaje implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(OrangeHrmPage.LBL_HIRE).answeredBy(actor);
    }

    public static VerificarMensaje exitoso() {
        return new VerificarMensaje();
    }
}
