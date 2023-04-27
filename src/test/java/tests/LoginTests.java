package tests;

import com.github.javafaker.Faker;
import config.CredentialsConfig;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import testdata.LoginTestsData;

@Feature("Login")
@Tag("login")
@Owner("K.Zolotovskiy")
public class LoginTests extends TestBase {

    Faker faker = new Faker();
    LoginTestsData data = new LoginTestsData();
    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Проверка успешной авторизации")
    void successfulLoginTest() {
        CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

        loginPage.openLoginPage()
                .setEmail(config.getEmail())
                .setPassword(config.getPassword())
                .pressEnterButton()
                .checkSuccessfulLogin(config.getUserName());
    }

    @Test
    @DisplayName("Проверка авторизации без пароля")
    void loginWithoutPasswordTest() {
        loginPage.openLoginPage()
                .setEmail(faker.internet().emailAddress())
                .pressEnterButton()
                .checkTextInEnterButton(data.enterButtonMessageWithoutPassword);
    }

    @Test
    @DisplayName("Проверка авторизации без e-mail")
    void loginWithoutEmailTest() {
        loginPage.openLoginPage()
                .setPassword(faker.internet().password())
                .pressEnterButton()
                .checkTextInEnterButton(data.enterButtonMessageWithoutEmail);
    }
}
