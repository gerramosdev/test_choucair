package german.ramos.perez.orange.tasks;

import german.ramos.perez.orange.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.Map;

import static german.ramos.perez.orange.userinterfaces.OrangeHrmPage.*;
import static german.ramos.perez.orange.utils.ConstantesDatos.*;

public class IniciarSesionTask implements Task {
    private final Map<String, String> testData;

    public IniciarSesionTask(Map<String, String> testData) {
        this.testData = testData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(testData.get(USUARIO)).into(TXT_USUARIO),
                Enter.theValue(testData.get(CONTRASENNA)).into(TXT_CONTRASENNA),
                Click.on(BTN_LOGIN)
        );
    }

    public static IniciarSesionTask usuarioRecruitment(Map<String, String> testData) {
        return Tasks.instrumented(IniciarSesionTask.class, testData);
    }

}