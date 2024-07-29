package com.orangehrmlive.opensource_demo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarCandidatoIU {
    public static final Target CATEGORY_RECRUITMENT = Target.the("Recruitment category").locatedBy("//*[@href=\"/web/index.php/recruitment/viewRecruitmentModule\"]");
    public static final Target BUTTON_ADD = Target.the("Add button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");


}
