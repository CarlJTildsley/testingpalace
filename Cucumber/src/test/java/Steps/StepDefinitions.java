package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.io.IOException;

import static utils.WebDriverUtils.*;

public class StepDefinitions {

    @Before
    public void setupDriver() {
        initialiseWebDriver();
    }

    @Before("@tag")
    public void loginToApplication() {
        login();
    }

    @After
    public void closeDriver() throws IOException {
        //takeScreenshot();
        closeWebDriver();
    }

    @When("^I Navigate to ([^\"]*)$")
    public void navigate(String link) {
        navigateToPage(link);
    }

    @And("^I complete field ([^\"]*) with some valid data ([^\"]*)$")
    public void completePage(String field, String value) {
        addFormValueByID(field, value);
    }

//    @Then("^I$")
//    public void i() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}
