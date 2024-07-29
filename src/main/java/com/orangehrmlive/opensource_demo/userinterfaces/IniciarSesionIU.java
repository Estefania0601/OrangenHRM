package com.orangehrmlive.opensource_demo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;


public class IniciarSesionIU {
    public static final Target INPUT_USER_NAME = Target.the("Username input").locatedBy("//*[@name=\"username\"]");
    public static final Target INPUT_PASSWORD = Target.the("Password input").locatedBy("//*[@name=\"password\"]");
    public static final Target BUTTON_LOGIN = Target.the("Login button").locatedBy("//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");

    public static final Target TITLE_DASHBOARD = Target.the("Dashboard title").locatedBy("//*[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");

}
