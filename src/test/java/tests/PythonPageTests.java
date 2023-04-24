package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testdata.PythonPageTestsData;


@Feature("Python")
@Tag("python")
@Owner("K.Zolotovskiy")
public class PythonPageTests extends TestBase {

    PythonPageTestsData data = new PythonPageTestsData();

    @Test
    @DisplayName("Проверка цены \"Курс Python\"")
    void pythonPriceOptionsTest() {
        pythonPage.openPythonPage()
                .checkCoursePrice(data.pythonFirstOptionPrice, data.pythonSecondOptionPrice, data.pythonThirdOptionPrice);
    }

    @Test
    @DisplayName("Проверка заголовков занятий в учебном плане курса Python")
    void pythonLessonsTitleTest() {
        pythonPage.openPythonPage()
                .checkCourseSyllabus(data.pythonLessonTitleList);
    }
}
