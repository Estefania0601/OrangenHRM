package com.orangehrmlive.opensource_demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FinalizarProcesoIU {
    public static final Target BUTTON_MARK_INTERVIEW_PASSED= Target.the("Markinterviewpassed button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--success\"]");
    public static final Target BUTTON_SAVE_MARK_INTERVIEW_PASSED = Target.the("SaveMarkinterviewpassed button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
    public static final Target BUTTON_OFFER_JOEB= Target.the("Offerjoeb button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
    public static final Target BUTTON_SAVE_OFFER_JOEB= Target.the("Saveofferjoeb button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
    public static final Target BUTTON_HIRE= Target.the("Hire button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--success\"]");
    public static final Target BUTTON_SAVE_HIRE= Target.the("Savehire button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
}
