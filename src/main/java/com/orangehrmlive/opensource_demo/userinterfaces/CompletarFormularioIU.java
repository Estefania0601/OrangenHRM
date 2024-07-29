package com.orangehrmlive.opensource_demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CompletarFormularioIU {
    public static final Target INPUT_FIRST_NAME = Target.the("Firstname input").locatedBy("//*[@name=\"firstName\"]");
    public static final Target INPUT_MIDDLE_NAME = Target.the("Middlename input").locatedBy("//*[@name=\"middleName\"]");
    public static final Target INPUT_LAST_NAME = Target.the("Lastname input").locatedBy("//*[@name=\"lastName\"]");
    public static final Target INPUT_EMAIL = Target.the("Contactnumber input").locatedBy("//label[text()='Email']/ancestor::div[contains(@class, 'oxd-input-group')]//input\n");
    public static final Target INPUT_CONTACT_NUMBER = Target.the("Contactnumber input").locatedBy("//label[text()='Contact Number']/ancestor::div[contains(@class, 'oxd-input-group')]//input\n");
    public static final Target INPUT_KEYWORDS = Target.the("Contactnumber input").locatedBy("//label[text()='Keywords']/ancestor::div[contains(@class, 'oxd-input-group')]//input\n");

    public static final Target BUTTON_SAVE_POSTULATION = Target.the("Savepostulation button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");


}