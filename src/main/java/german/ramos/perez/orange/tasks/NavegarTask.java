package german.ramos.perez.orange.tasks;

import german.ramos.perez.orange.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavegarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrangeHrmPage.BTN_RECRUITMENT),
                Click.on(OrangeHrmPage.BTN_ADD)
        );
    }

    public static NavegarTask buscarFormulario() {
        return Tasks.instrumented(NavegarTask.class);
    }
}
