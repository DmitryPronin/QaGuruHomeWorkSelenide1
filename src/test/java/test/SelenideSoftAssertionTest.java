package test;

import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertionTest {

    @Test
    void successSoftAssertionTest(){
        // открыть страничку репозитория Селенида
        open("https://github.com/selenide/selenide");
        // открыть вкладку Wiki
        $("#wiki-tab").click();
        //кликнуть по Soft assertions
        $(new ByText("Soft assertions")).should(visible).click();
        //проверить наличие блока Junit5
        $(new ByText("Using JUnit5 extend test class:")).scrollTo().should(visible);
    }
}
