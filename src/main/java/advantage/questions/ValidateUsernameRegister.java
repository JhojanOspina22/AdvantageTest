package advantage.questions;

import advantage.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.remote.server.handler.GetElementText;


public class ValidateUsernameRegister implements Question {

    @Override
    public Object answeredBy(Actor actor) {

       return HomePage.TXT_USERNAME.resolveFor(actor).getText();
    }
    public static ValidateUsernameRegister username(){
        return new ValidateUsernameRegister();
    }
}
