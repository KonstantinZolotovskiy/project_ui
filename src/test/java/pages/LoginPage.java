package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private final static String HEADER = "Войти";

    SelenideElement
            header = $("h2.xdget-block"),
            emailInput = $("[name='email']"),
            passwordInput = $("[name='password']"),
            enterButton = $(".btn-success"),
            welcomeTitle = $(".logined-form .xdget-header"),
            accountButton = $(".main-header__login");

    @Step("Открыть страницу авторизации")
    public LoginPage openLoginPage() {
        open("/cms/system/login");
        header.shouldHave(text(HEADER));
        return this;
    }

    @Step("Установить значение в поле \"e-mail\"")
    public LoginPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("Установить значение в поле \"password\"")
    public LoginPage setPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    @Step("Нажать кнопку \"Войти\"")
    public LoginPage pressEnterButton() {
        enterButton.pressEnter();
        return this;
    }

    @Step("Проверка текста кнопки \"Войти\"")
    public void checkTextInEnterButton(String text) {
        enterButton.shouldHave(text(text));
    }

    @Step("Проверка успешной авторизации")
    public void checkSuccessfulLogin(String userName) {
        accountButton.click();
        welcomeTitle.shouldHave(text("Здравствуйте, " + userName));
    }
}
