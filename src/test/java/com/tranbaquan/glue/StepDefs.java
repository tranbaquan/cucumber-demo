package com.tranbaquan.glue;

import com.tranbaquan.service.UserService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest
public class StepDefs {

    @Autowired
    private UserHelper userHelper;

    @Autowired
    private UserService userService;

    @Given("I enter an username: {string}")
    public void inputUsername(String username) {
        userHelper.init();
        userHelper.setUserName(username);
    }

    @Given("I enter a password: {string}")
    public void inputPassword(String password) {
        userHelper.setPassword(password);
    }

    @When("I authorize user")
    public void authorizeUser() {
        userHelper.setAuthorized(userService.authorizeUser(userHelper.getUser()));
    }

    @Then("I expect to receive {string}")
    public void testExpect(String value) {
        Assert.assertEquals(userHelper.isAuthorized(), Boolean.parseBoolean(value));
    }
}
