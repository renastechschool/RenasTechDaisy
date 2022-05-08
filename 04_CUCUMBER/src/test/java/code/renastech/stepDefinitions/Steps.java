package code.renastech.stepDefinitions;

import code.renastech.pages.Home;
import code.renastech.pages.Payment;
import code.renastech.pages.Verification;
import code.renastech.utils.BrowserUtils;
import code.renastech.utils.ConfigurationsReader;
import code.renastech.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.Map;

public class Steps extends BrowserUtils {
    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.get(ConfigurationsReader.getProperties("url"));
        driver.manage().window().maximize();
        System.out.println("The website is launched");

    }
    @When("The user wants to buy elephant toy")
    public void the_user_wants_to_buy_elephant_toy() {
        Home home=new Home();
        home.setBuyNow();

    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        Payment payment=new Payment();
        payment.setCardnumber(dataTable.get("CNumber"));
        payment.setMonth(dataTable.get("EMonth"));
        payment.setYear(dataTable.get("EYear"));
        payment.setCvvCode(dataTable.get("CVV"));

    }
    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {
        Payment payment=new Payment();
        payment.setPayButton();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String expected) {
        Verification verification=new Verification();
        verification.setVerificationText(expected);

    }

}
