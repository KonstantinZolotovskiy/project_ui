package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testdata.JavaPageTestsData;

@Feature("Java")
@Tag("java")
public class JavaPageTests extends TestBase {

    JavaPageTestsData data = new JavaPageTestsData();

    @Test
    @DisplayName("Проверка цены \"Курс Java\"")
    @Owner("K.Zolotovskiy")
    void javaPriceOptionsTest() {
        javaPage.openJavaPage()
                .checkCoursePrice(data.javaFirstOptionPrice, data.javaSecondOptionPrice, data.javaThirdOptionPrice);
    }

    @Test
    @DisplayName("Проверка заголовков занятий в учебном плане курса Java")
    @Owner("K.Zolotovskiy")
    void javaLessonsTitleTest() {
        javaPage.openJavaPage()
                .checkCourseSyllabus(data.javaLessonTitleList);
    }
}
