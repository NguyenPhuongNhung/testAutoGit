package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import MyRunner.*;
import org.openqa.selenium.By;

public class loginStepsDefinition extends TestRunner {


    @Given("Open website (.*)$")
    public void user_already_on_home_page(String website) {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();

    }

    @When("^I input username as (.*) and password as (.*)$")
    public void select_first_item(String username, String password) {
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);

    }

    @Then("^I click submit$")
    public void select_second_item() {

    }

    @Then("^I verify system navigates to the dashboard page")
    public void add_new_item() {

    }


}
