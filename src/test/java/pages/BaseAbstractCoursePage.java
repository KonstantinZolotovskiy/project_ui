package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class BaseAbstractCoursePage {

    SelenideElement
            header = $("h1.title"),
            priceButton = $("[href='#course_price']"),
            modalWindowWithSyllabus = $(".lesson-list"),
            firstOption = $("[data-param='data/0/price']"),
            secondOption = $("[data-param='data/1/price']"),
            thirdOption = $("[data-param='data/2/price']"),
            syllabusButton = $(".main-header__menu .show-programm-btn-2");

    ElementsCollection lessonsTitle = $$x("//div[@class='link title']");

    public void checkTitle(String title) {
        header.shouldHave(exactText(title));
    }

    public void clickSyllabusButton() {
        syllabusButton.should(visible).click();
    }

    @Step("Проверка программы курса")
    public void checkCourseSyllabus(List<String> lessonTitleList) {
        clickSyllabusButton();
        modalWindowWithSyllabus.should(visible);
        lessonTitleList.forEach(e -> lessonsTitle.find(text(e)).scrollIntoView(true).should(visible));
    }

    @Step("Проверка цены на курс")
    public void checkCoursePrice(String firstOptionPrice, String secondOptionPrice, String thirdOptionPrice) {
        priceButton.click();
        firstOption.shouldHave(text(firstOptionPrice));
        secondOption.shouldHave(text(secondOptionPrice));
        thirdOption.shouldHave(text(thirdOptionPrice));
    }
}
