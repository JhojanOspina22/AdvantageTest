package advantage.stepdefinitions;

import advantage.interactions.SignUpFormulariesUserMenu;
import advantage.questions.ValidateUsernameRegister;
import advantage.tasks.EnterDataCreateAccount;
import advantage.userinterfaces.HomePage;
import advantage.userinterfaces.UserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class CreateAccountStepsDefinitions {

    @Managed
     public WebDriver Browser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Browser)));
        OnStage.theActorCalled("Jhojan");
    }

    @Given("^User click on the button user menu$")
    public void userClickOnTheButtonUserMenu() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.advantageonlineshopping.com/#/"));
        OnStage.theActorInTheSpotlight().wasAbleTo(SignUpFormulariesUserMenu.click());

    }


    @When("^the user enters the username(.*) email(.*) password(.*) and confirm password(.*)$")
    public void theUserEntersData(String username, String email, String password, String confirmPassword) {
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterDataCreateAccount.data(username,email,password,confirmPassword));

    }

    @Then("^the user will see (.*)$")
    public void theUserWillSee(String username){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUsernameRegister.username(), equalTo(username)));
    }



}
