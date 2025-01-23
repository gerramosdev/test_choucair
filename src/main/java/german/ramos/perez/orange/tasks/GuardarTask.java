package german.ramos.perez.orange.tasks;

import german.ramos.perez.orange.interactions.EsperaImplicita;
import german.ramos.perez.orange.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

import static german.ramos.perez.orange.userinterfaces.OrangeHrmPage.*;
import static german.ramos.perez.orange.utils.ConstantesDatos.*;

public class GuardarTask implements Task {
    public GuardarTask(Map<String, String> testData) {
        this.testData = testData;
    }

    private final Map<String, String> testData;

    public static GuardarTask postulacion(Map<String, String> testData) {
        return Tasks.instrumented(
                GuardarTask.class, testData
        );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GUARDAR),
                EsperaImplicita.seg(7),
                Click.on(BTN_LISTA_CANDIDATOS_2),
                Click.on(BTN_GUARDAR),
                EsperaImplicita.seg(7),
                Click.on(BTN_LISTA_CANDIDATOS_2),
                Enter.theValue(testData.get(ENTREVISTA)).into(TXT_ENTREVISTA),
                Enter.theValue(testData.get(ENTREVISTADOR)).into(TXT_ENTREVISTADOR),
                EsperaImplicita.seg(3),
                SendKeys.of(Keys.DOWN, Keys.ENTER).into(TXT_ENTREVISTADOR),
                Enter.theValue(testData.get(FECHA_INICIO)).into(TXT_FECHA_ENTREVISTA),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_PASSED),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_OFFER_JOB),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_PASSED),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_RECRUITMENT),
                EsperaImplicita.seg(2),
                Enter.theValue("qa choucair").into(TXT_BUSCADOR),
                EsperaImplicita.seg(2),
                Click.on(OrangeHrmPage.BTN_BUSCADOR),
                Scroll.to(LBL_HIRE)

        );
    }
}
