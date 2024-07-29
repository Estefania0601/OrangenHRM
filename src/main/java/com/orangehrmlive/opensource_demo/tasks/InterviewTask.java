package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.orangehrmlive.opensource_demo.userinterfaces.AgendarEntrevistaIU.INPUT_INTERVIEWTITLE;
import static com.orangehrmlive.opensource_demo.userinterfaces.IniciarSesionIU.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InterviewTask implements Task {
    private final String titleInterview;

    public InterviewTask(String titleInterview) {
        this.titleInterview = titleInterview;
    }
    public static InterviewTask Interview(String titleInterview) {
        return instrumented(InterviewTask.class, titleInterview);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(titleInterview).into(INPUT_INTERVIEWTITLE)
        );
    }


}


