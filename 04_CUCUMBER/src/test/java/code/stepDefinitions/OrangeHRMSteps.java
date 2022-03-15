package code.stepDefinitions;

import code.pages.OrangeHRMHome;
import code.pages.OrangeHRMLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrangeHRMSteps {

    @Given("The user wants to go to orangeHRM application")
    public void the_user_wants_to_go_to_orange_hrm_application() {
        System.out.println("Browser is launched");

    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        OrangeHRMLogin orangeHRMLogin =new OrangeHRMLogin();
        orangeHRMLogin.setUsername();
        orangeHRMLogin.setPassword();




    }
    @Then("The user wants to click login")
    public void the_user_wants_to_click_login() {
        OrangeHRMLogin orangeHRMLogin =new OrangeHRMLogin();
        orangeHRMLogin.setLoginbutton();


    }
    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {
        OrangeHRMHome orangeHRMHome=new OrangeHRMHome();
        orangeHRMHome.setDashboardMessage();


    }
}
