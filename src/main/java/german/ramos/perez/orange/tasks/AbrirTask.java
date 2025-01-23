package german.ramos.perez.orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirTask implements Task {

    public static AbrirTask paginaOrangeHrm() {
        return Tasks.instrumented(AbrirTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
                Browser.maximize());
    }
}
