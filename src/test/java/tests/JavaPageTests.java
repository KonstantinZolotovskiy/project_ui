package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.JavaPage;
import testdata.JavaPageTestsData;

@Feature("Java")
@Tag("java")
@Owner("K.Zolotovskiy")
public class JavaPageTests extends TestBase {

    JavaPageTestsData data = new JavaPageTestsData();
    JavaPage javaPage = new JavaPage();

    @Test
    @DisplayName("Проверка цены \"Курс Java\"")
    void javaPriceOptionsTest() {
        javaPage.openJavaPage()
                .checkCoursePrice(data.javaFirstOptionPrice, data.javaSecondOptionPrice, data.javaThirdOptionPrice);
    }

    @Test
    @DisplayName("Проверка заголовков занятий в учебном плане курса Java")
    void javaLessonsTitleTest() {
        javaPage.openJavaPage()
                .checkCourseSyllabus(data.javaLessonTitleList);
    }
}
