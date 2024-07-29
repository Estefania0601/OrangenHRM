package com.orangehrmlive.opensource_demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AgendarEntrevistaIU {
    public static final Target BUTTON_SCHEDULEINTERVIEW = Target.the("Scheduleinterview button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--success\"]");
    public static final Target INPUT_INTERVIEWTITLE = Target.the("Interviewtitle input").locatedBy("//*[@class=\"oxd-input oxd-input--active\"]");
    public static final Target INPUT_INTERVIEWER = Target.the("Interviewer input").locatedBy("//*[@class=\"oxd-autocomplete-text-input--after\"]");
    public static final Target DATE_DATE = Target.the("date date").locatedBy("//*[@class=\"oxd-input oxd-input--active\"]");
    public static final Target BUTTON_SAVE_SCHEDULEINTERVIEW = Target.the("Savescheduleinterview button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");

}
