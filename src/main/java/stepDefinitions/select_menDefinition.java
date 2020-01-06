package stepDefinitions;

import MyRunner.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class select_menDefinition extends TestRunner {
    @Given("I open select menu website (.*)$")
    public void user_come_on_home_page(String website) throws InterruptedException {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);
    }

//    @When("I select speed as(.*)$ ")
//    public void select_speed_item() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"speed-button\"]/span[1]")).click();
//        Thread.sleep(2000);
//    }

//    @Then("^I verify fast value is already selected in the speed$")
//    public void iVerifyFastValueIsAlreadySelectedInTheSpeed() {
//    }


}
