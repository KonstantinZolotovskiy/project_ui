package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testdata.JavaAdvancePageTestsData;

@Feature("Java Advance")
@Tag("java_advance")
public class JavaAdvancePageTests extends TestBase {

    JavaAdvancePageTestsData data = new JavaAdvancePageTestsData();

    @Test
    @DisplayName("Проверка заголовков занятий в учебном плане курса Java Advance")
    @Owner("K.Zolotovskiy")
    void javaAdvanceLessonsTitleTest() {
        javaAdvancedPage.openJavaAdvancedPage()
                .checkCourseSyllabus(data.javaAdvanceLessonTitleList);
    }
}