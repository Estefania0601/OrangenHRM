package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.orangehrmlive.opensource_demo.userinterfaces.AgendarEntrevistaIU.*;

public class AgendarEntrevistaTask implements Task {
    private final String interviewerName;
    private final String interviewDate;

    public AgendarEntrevistaTask(String interviewerName, String interviewDate) {
        this.interviewerName = interviewerName;
        this.interviewDate = interviewDate;
    }

    public static AgendarEntrevistaTask withDetails(String interviewerName, String interviewDate) {
        return new AgendarEntrevistaTask(interviewerName, interviewDate);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(interviewerName).into(INPUT_INTERVIEWER),
                Enter.theValue(interviewDate).into(DATE_DATE),
                Click.on(BUTTON_SAVE_SCHEDULEINTERVIEW)
        );


    }
}
