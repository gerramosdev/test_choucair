package german.ramos.perez.orange.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeHrmPage {
    public static final Target TXT_USUARIO = Target.the("Espacio para el Usuario").located(By.name("username"));
    public static final Target BTN_LOGIN = Target.the("Boton para ingresar").located(By.xpath("//button[@type='submit']"));
    public static final Target TXT_CONTRASENNA = Target.the("Espacio para la contraseña").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BTN_RECRUITMENT = Target.the("Opcion Recruitment").located(By.xpath("//span[contains(@class, 'oxd-main-menu-item--name') and text()='Recruitment']"));
    public static final Target BTN_ADD = Target.the("Opcion + ADD").located(By.xpath("//button[contains(@class, 'oxd-button--secondary') and contains(., 'Add')]"));
    public static final Target TXT_NOMBRE = Target.the("Espacio para el Nombre").located(By.name("firstName"));
    public static final Target TXT_SEGUNDO_NOMBRE = Target.the("Espacio para el segundo nombre").located(By.name("middleName"));
    public static final Target TXT_APELLIDO = Target.the("Espacio para el apellido").located(By.name("lastName"));
    public static final Target BTN_VACANTE = Target.the("Desplegar Vacantes").located(By.xpath("//div[@class='oxd-select-text-input' and text()='-- Select --']"));
    public static final Target TXT_CORREO = Target.the("Espacio para escribir el email").located(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']"));
    public static final Target TXT_NUMERO_TELEFONO = Target.the("Espacio para numero de telefono").located(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']"));
    public static final Target TXT_PALABRA_CLAVE = Target.the("Espacio para palabras claves").located(By.xpath("//input[contains(@class, 'oxd-input--active') and contains(@placeholder, 'comma seperated words')]"));
    public static final Target TXT_FECHA_APLICACION = Target.the("Espacio para la fecha de la aplicacion de la vacante").located(By.xpath("//div[@class='oxd-date-input']//input[@placeholder='yyyy-dd-mm']"));
    public static final Target TXT_NOTAS = Target.the("Espacio para notas").located(By.xpath("//textarea[@placeholder='Type here']"));
    public static final Target CHBX_CONSENTIMIENTO = Target.the("Aceptar consentimiento").located(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public static final Target BTN_GUARDAR = Target.the("Guardar Postulacion").located(By.xpath("//button[@type='submit']"));
    public static final Target BTN_LISTA_CANDIDATOS = Target.the("Participante Guardado Satisfactorio").located(By.xpath("(//button[@type='button'])[4]"));
    ;
    public static final Target BTN_LISTA_CANDIDATOS_2 = Target.the("Participante Guardado Satisfactorio").located(By.xpath("(//button[@type='button'])[5]"));
    public static final Target BTN_CARGAR_DOCUMENTO= Target.the("Cargar documento permitidio").located(By.xpath("//input[@type='file']"));
    public static final Target TXT_ENTREVISTA = Target.the("Entrevista").located(By.xpath("(//input[contains(@class, 'oxd-input')])[6]"));
    public static final Target TXT_ENTREVISTADOR = Target.the("Entrevistador").located(By.xpath("//input[@data-v-75e744cd and @include-employees='onlyCurrent' and @placeholder='Type for hints...']"));
    public static final Target TXT_FECHA_ENTREVISTA = Target.the("Fecha").located(By.xpath("(//input[contains(@class, 'oxd-input')])[7]"));
    public static final Target BTN_PASSED = Target.the("Passed").located(By.xpath("//button[contains(@class, 'oxd-button--success')]"));
    public static final Target BTN_OFFER_JOB = Target.the("Otra Oferta").located(By.xpath("(//button[contains(@class, 'oxd-button--success')])[2]"));
    public static final Target LBL_HIRE = Target.the("HIRE - CONTRATADO!").located(By.xpath("(//div[@data-v-6c07a142 and text()='Hired'])[1]"));

    public static final Target BTN_BUSCADOR = Target.the("Buscador").located(By.xpath("//button[contains(@class, 'oxd-button--secondary') and text()=' Search ']"));
    public static final Target TXT_BUSCADOR = Target.the("Buscador").located(By.xpath("//input[contains(@placeholder, 'Enter comma')]"));
    public static final Target BTN_ESTADO = Target.the("estado").located(By.xpath("(//i[contains(@class, 'oxd-icon bi-caret-down-fill oxd-select-text--arrow')])[4]"));
    public static final Target BTN_ESTADO_2 = Target.the("estado").located(By.xpath("(//i[contains(@class, 'oxd-icon bi-caret-down-fill oxd-select-text--arrow')])[4]"));
}
