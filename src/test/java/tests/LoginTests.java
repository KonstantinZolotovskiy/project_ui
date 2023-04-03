package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Feature("Login")
@Tag("login")
public class LoginTests extends TestBase {

    @Test
    @DisplayName("Проверка авторизации без пароля")
    @Owner("K.Zolotovskiy")
    void loginWithoutPassword() {
        loginPage.openLoginPage()
                .setEmail(faker.internet().emailAddress())
                .pressEnterButton()
                .checkTextInEnterButton(data.enterButtonMessageWithoutPassword);
    }

    @Test
    @DisplayName("Проверка авторизации без e-mail")
    @Owner("K.Zolotovskiy")
    void loginWithoutEmail() {
        loginPage.openLoginPage()
                .setPassword(faker.internet().password())
                .pressEnterButton()
                .checkTextInEnterButton(data.enterButtonMessageWithoutEmail);
    }
}
