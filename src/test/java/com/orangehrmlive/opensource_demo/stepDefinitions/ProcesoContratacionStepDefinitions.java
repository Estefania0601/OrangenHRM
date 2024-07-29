package com.orangehrmlive.opensource_demo.stepDefinitions;

import com.orangehrmlive.opensource_demo.questions.ValidacionPaginaDashbordQuestion;
import com.orangehrmlive.opensource_demo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import net.thucydides.core.util.EnvironmentVariables;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import static com.orangehrmlive.opensource_demo.utils.Constants.*;
import static com.orangehrmlive.opensource_demo.utils.Time.waiting;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;



public class ProcesoContratacionStepDefinitions {

    private static EnvironmentVariables environmentVariables;
    private String userName;
    private String password;

    private String firstName;

    private String middleName;

    private String lastName;

    private String vacancy;

    private String email;

    private String number;

    private String keywords;

    private String titleInterview;



    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("{string} abre el sitio web de prueba")
    public void abreElSitioWebDePrueba(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                AbrirPaginaTask.broserUrl()
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );
    }

    @Cuando("inicio sesión con credenciales válidas y visualiza pagina de {string}")
    public void inicioSesiónConCredencialesVálidasYVisualizaPaginaDe(String textValidation) {
        userName = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD);
        theActorCalled(ACTOR).attemptsTo(
                IniciarSesionTask.authentication(userName, password)
        );
        OnStage.theActorInTheSpotlight().should(
                seeThat("El usuario puede ver la página del dashboard",
                        ValidacionPaginaDashbordQuestion.isVisible(textValidation),
                        Matchers.equalTo(true))
        );
    }

    @Cuando("{string} navega a la sección de reclutamiento y hace clic en el botón agregar")
    public void navegaALaSecciónDeReclutamientoYHaceClicEnElBotónAgregar(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(AgregarCandidatoTask.addRecruitment());
    }

    @Cuando("{string} completa los detalles del candidato con información válida")
    public void completaLosDetallesDelCandidatoConInformaciónVálida(String actor) {
        firstName = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(CANDIDATE_FIRST_NAME);
        middleName = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(CANDIDATE_MIDDLE_NAME);
        lastName = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(CANDIDATE_LAST_NAME);
        email = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(CANDIDATE_EMAIL);
        number = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(CANDIDATE_NUMBER);
        keywords = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(CANDIDATE_KEYWORDS);
        titleInterview = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(TITLE_INTERVIEW);

        theActorCalled(ACTOR).attemptsTo(
                DatosCandidatoTask.withDetails(firstName, middleName, lastName, email, number, keywords)
        );
        theActorInTheSpotlight().attemptsTo(ListaVacanteTask.now());//revisar

        OnStage.theActorCalled(actor).wasAbleTo(ListaCortaPostulacionTask.shorList());

        theActorCalled(ACTOR).attemptsTo(
                InterviewTask.Interview(titleInterview)
        );
        theActorCalled(ACTOR).attemptsTo(
                AgendarEntrevistaTask.withDetails("John Doe", "2024-08-15")
        );//revisar
        OnStage.theActorCalled(actor).wasAbleTo(FinalizarProcesoTask.buttons());
    }

    @Entonces("los datos deberían coincidir con los ingresados y el estado debería ser {string}")
    public void losDatosDeberíanCoincidirConLosIngresadosYElEstadoDeberíaSer(String string) {

    }



}
