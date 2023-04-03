package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Java Advance")
public class JavaAdvancePageTests extends TestBase {

    @Test
    @DisplayName("Проверка заголовков занятий в учебном плане курса Java Advance")
    @Owner("K.Zolotovskiy")
    void javaAdvanceLessonsTitleTest() {
        javaAdvancedPage.openJavaAdvancedPage()
                .checkCourseSyllabus(data.javaAdvanceLessonTitleList);
    }
}