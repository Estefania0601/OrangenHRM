package com.orangehrmlive.opensource_demo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class ListaCortaIU {
    public static final Target BUTTON_SHORLIST = Target.the("Shortlist button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--success\"]");
    public static final Target BUTTON_SAVE_SHORLIST = Target.the("Saveshortlist button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
}
