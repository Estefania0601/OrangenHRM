package com.orangehrmlive.opensource_demo.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.orangehrmlive.opensource_demo.userinterfaces.AgregarCandidatoIU.CATEGORY_RECRUITMENT;
import static com.orangehrmlive.opensource_demo.utils.Constants.TIME_SHORT;
import static com.orangehrmlive.opensource_demo.userinterfaces.AgregarCandidatoIU.BUTTON_ADD;


public class AgregarCandidatoTask implements Task {
    public static AgregarCandidatoTask addRecruitment() {
        return new AgregarCandidatoTask();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORY_RECRUITMENT)
        );
        try {
            Thread.sleep(TIME_SHORT);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BUTTON_ADD)
        );
    }
}
