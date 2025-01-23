package german.ramos.perez.orange.stepdefinitions;

import german.ramos.perez.orange.questions.VerificarMensaje;
import german.ramos.perez.orange.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;
public class OrangeHRMStepDefinitions {
    @Before
    public void iniciarSesion(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el Usuario accede a OrangeHRM")
    public void queElUsuarioAccedeAOrangeHRM() {
        OnStage.theActorCalled("German").wasAbleTo(AbrirTask.paginaOrangeHrm());
    }

    @Cuando("inicio sesion con las credenciales de un usuario valido")
    public void inicioSesionConLasCredencialesDeUnUsuarioValido(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(CargarDatosTask.testData(testData.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.usuarioRecruitment(testData.get(0)));
    }

    @Y("me dirijo a la seccion Recruitment y presiono el boton +Add")
    public void meDirijoALaSeccionRecruitmentYPresionoElBotonAdd() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavegarTask.buscarFormulario());
    }

    @Y("lleno el formulario de registro de contratacion con")
    public void llenoElFormularioDeRegistroDeContratacionCon(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioTask.aspirante(testData.get(0)));
    }

    @Y("guardo los datos de la nueva contratacion")
    public void guardoLosDatosDeLaNuevaContratacion(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(GuardarTask.postulacion(testData.get(0)));
    }

    @Entonces("confirmo que la nueva contratacion fue registrada correctamente")
    public void confirmoQueLaNuevaContratacionFueRegistradaCorrectamente(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMensaje.exitoso(), Matchers.equalTo("Hired")));
    }
}
