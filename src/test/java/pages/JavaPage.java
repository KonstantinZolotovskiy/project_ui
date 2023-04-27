package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class JavaPage extends BaseAbstractCoursePage {

    private final static String TITLE = "Школа инженеров по автоматизации тестирования на Java";

    @Step("Открыть страницу \"Курсы Java\"")
    public JavaPage openJavaPage() {
        open("/");
        checkTitle(TITLE);
        return this;
    }
}
