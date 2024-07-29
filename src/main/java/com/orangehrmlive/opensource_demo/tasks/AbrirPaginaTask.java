package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static com.orangehrmlive.opensource_demo.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AbrirPaginaTask implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathWebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebUrl));
    }

    public static Performable broserUrl() {
        return instrumented(AbrirPaginaTask.class);
        //return instrumented(OpenUrl.class);
    }
}
