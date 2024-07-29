package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.orangehrmlive.opensource_demo.userinterfaces.IniciarSesionIU.*;

public class IniciarSesionTask implements Task {

    private String userName;
    private String password;

    public IniciarSesionTask(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static IniciarSesionTask authentication(String userName, String password) {
        return instrumented(IniciarSesionTask.class, userName, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(INPUT_USER_NAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
