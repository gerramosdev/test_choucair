package german.ramos.perez.orange.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static german.ramos.perez.orange.userinterfaces.OrangeHrmPage.*;

public class SeleccionarVacante implements Interaction {

    private String vacante;

    public SeleccionarVacante(String vacante) {
        this.vacante = vacante;
    }

    public static SeleccionarVacante opcion(String vacante) {
        return new SeleccionarVacante(vacante);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (vacante) {
            case "Junior Account Assistant":
                actor.attemptsTo(
                        SendKeys.of(Keys.DOWN, Keys.ENTER).into(BTN_VACANTE)
                );
                break;
            case "Payroll Administrator":
                actor.attemptsTo(
                        SendKeys.of(Keys.DOWN, Keys.DOWN, Keys.ENTER).into(BTN_VACANTE)
                );
                break;
            case "Sales Representative":
                actor.attemptsTo(
                        SendKeys.of(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).into(BTN_VACANTE)
                );
                break;
            case "Senior QA Lead":
                actor.attemptsTo(
                        SendKeys.of(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).into(BTN_VACANTE)
                );
                break;
            case "Senior Support Specialist":
                actor.attemptsTo(
                        SendKeys.of(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).into(BTN_VACANTE)
                );
                break;
            case "Software Engineer":
                actor.attemptsTo(
                        SendKeys.of(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).into(BTN_VACANTE)
                );
                break;
            case "test":
                actor.attemptsTo(
                        SendKeys.of(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).into(BTN_VACANTE)
                );
                break;
            default:
                break;
        }
    }
}