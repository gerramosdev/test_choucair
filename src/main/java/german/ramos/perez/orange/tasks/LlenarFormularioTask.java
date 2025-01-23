package german.ramos.perez.orange.tasks;

import german.ramos.perez.orange.interactions.SeleccionarVacante;
import german.ramos.perez.orange.userinterfaces.OrangeHrmPage;
import german.ramos.perez.orange.utils.MetodosUtilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;
import static german.ramos.perez.orange.userinterfaces.OrangeHrmPage.*;
import static german.ramos.perez.orange.utils.ConstantesDatos.*;

public class LlenarFormularioTask implements Task {

    private final Map<String, String> testData;

    public LlenarFormularioTask(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.get(NOMBRE)).into(TXT_NOMBRE),
                Enter.theValue(testData.get(SEGUNDO_NOMBRE)).into(TXT_SEGUNDO_NOMBRE),
                Enter.theValue(testData.get(APELLIDO)).into(TXT_APELLIDO),
                Click.on(BTN_VACANTE),
                SeleccionarVacante.opcion(testData.get(VACANTE)),
                Enter.theValue(testData.get(EMAIL)).into(TXT_CORREO),
                Enter.theValue(testData.get(NUMERO_TELEFONO)).into(TXT_NUMERO_TELEFONO),
                SendKeys.of(MetodosUtilitarios.rutaArchivo()).into(OrangeHrmPage.BTN_CARGAR_DOCUMENTO),
                Enter.theValue(testData.get(PALABRA_CLAVE)).into(TXT_PALABRA_CLAVE),
                SendKeys.of(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE).into(TXT_FECHA_APLICACION),
                Enter.theValue(testData.get(FECHA_INICIO)).into(TXT_FECHA_APLICACION).thenHit(Keys.TAB),
                Enter.theValue(testData.get(NOTAS)).into(TXT_NOTAS),
                Click.on(CHBX_CONSENTIMIENTO)
        );
    }


    public static LlenarFormularioTask aspirante(Map<String, String> testData) {
        return Tasks.instrumented(LlenarFormularioTask.class, testData);
    }
}
