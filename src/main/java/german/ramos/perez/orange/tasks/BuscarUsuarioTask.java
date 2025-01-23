package german.ramos.perez.orange.tasks;

import german.ramos.perez.orange.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

public class BuscarUsuarioTask implements Task {

    private final Map<String, String> testData;

    public BuscarUsuarioTask(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.get("nombre")).into(OrangeHrmPage.TXT_BUSCADOR),
                Enter.keyValues(Keys.DOWN).into(OrangeHrmPage.TXT_BUSCADOR),
                Enter.keyValues(Keys.ENTER).into(OrangeHrmPage.TXT_BUSCADOR),
                Click.on(OrangeHrmPage.BTN_BUSCADOR)
        );
    }

    public static BuscarUsuarioTask pustalacion(Map<String, String> testData) {
        return Tasks.instrumented(BuscarUsuarioTask.class, testData);
    }
}
