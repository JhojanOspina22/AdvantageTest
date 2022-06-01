Feature: As user i need sing up in advantage page

  Background: Into the advantage page
    Given User click on the button user menu

  Scenario: validate user Register
    When the user enters the username jhojan9 email jc.kmilo22@gmail.com password Jhojan123 and confirm password Jhojan123
    Then the user will see jhojan9
