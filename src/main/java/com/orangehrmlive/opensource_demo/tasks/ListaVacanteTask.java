package com.orangehrmlive.opensource_demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static com.orangehrmlive.opensource_demo.userinterfaces.CompletarFormularioIU.*;

public class ListaVacanteTask implements Task {
    private static final Target DROPDOWN_TOGGLE = Target.the("Dropdown toggle icon")
            .located(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow --readonly']"));

    // Define the Target for the option
    private static final Target OPTION_PAYROLL_ADMINISTRATOR = Target.the("Payroll Administrator option")
            .located(By.xpath("//div[@class='oxd-select-dropdown']/div[text()='Payroll Administrator']"));

    public static ListaVacanteTask now() {
        return new ListaVacanteTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DROPDOWN_TOGGLE), // Clicks on the dropdown icon to show the options
                WaitUntil.the(OPTION_PAYROLL_ADMINISTRATOR, WebElementStateMatchers.isVisible()), // Wait until the option is visible
                Click.on(OPTION_PAYROLL_ADMINISTRATOR), // Clicks on the desired option
                Click.on(BUTTON_SAVE_POSTULATION) // Clicks on the save button
        );

    }
}
