package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class JavaAdvancedPage extends BaseAbstractCoursePage {

    private final static String TITLE = "Автоматизация тестирования на Java Advanced";

    @Step("Открыть страницу \"Курсы Java+\"")
    public JavaAdvancedPage openJavaAdvancedPage() {
        open("/java-advanced");
        checkTitle(TITLE);
        return this;
    }
}
