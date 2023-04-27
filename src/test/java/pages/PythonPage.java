package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class PythonPage extends BaseAbstractCoursePage {

    private final static String TITLE = "Курс инженеров по автоматизации тестирования на Python";


    @Step("Открыть страницу \"Курсы Python\"")
    public PythonPage openPythonPage() {
        open("/python");
        checkTitle(TITLE);
        return this;
    }
}
