package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrmlive.opensource_demo.userinterfaces.FinalizarProcesoIU.*;


public class FinalizarProcesoTask implements Task {

    public static FinalizarProcesoTask buttons() {
        return new FinalizarProcesoTask();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_MARK_INTERVIEW_PASSED),
                Click.on(BUTTON_SAVE_MARK_INTERVIEW_PASSED),
                Click.on(BUTTON_OFFER_JOEB),
                Click.on(BUTTON_SAVE_OFFER_JOEB),
                Click.on(BUTTON_HIRE),
                Click.on(BUTTON_SAVE_HIRE)
        );

    }
}
