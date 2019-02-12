package com.example.demoandroid.cucumber.step;

import com.example.demoandroid.UserInfoController;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDetailsStep {

    private UserInfoController infoController = new UserInfoController();

    @Given("^I start the application$")
    public void i_start_app(){
        System.out.println("Application Started");
    }

    @When("^I click email field$")
    public void i_click_email_field(){
        System.out.println("Email field selected");
    }

    @And("^I close the keyboard$")
    public void i_close_the_keyboard(){
        System.out.println("Keyboard closed");
    }

    @And("^I enter valid email (\\S+)$")
    public void i_enter_valid_email(String email){
        if(infoController.checkEmailFormat(email)){
            System.out.println("Type email: "+ email);
        }else{
            Assert.fail("Format du mail '"+ email +"' incorrect");
        }
    }

    @And("^I enter invalid email (\\S+)$")
    public void i_enter_invalid_email(String email){
        if(infoController.checkEmailFormat(email)){
            System.out.println("Type email: "+ email);
        }else{
            Assert.fail("Format du mail '"+ email +"' incorrect");
        }
    }

    @And("^I click password field$")
    public void i_click_password_field(){
        System.out.println("Password field selected");
    }

    @And("^I enter valid password (\\S+)$")
    public void i_enter_valide_password(String password){
        System.out.println("Type password: "+ password);
    }

    @And("^I click sign in button$")
    public void i_click_sign_in_button(){
        System.out.println("Signin button clicked");
    }

    @Then("^I expect to see successful login message$")
    public void i_expect_to_see_successful_login_message(){
        System.out.println("Show message : Login success");
    }
}
