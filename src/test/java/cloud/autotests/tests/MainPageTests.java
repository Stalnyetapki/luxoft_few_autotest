package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTests extends TestBase {
    @Test
    @Description("Test search work by site")
    @DisplayName("Send request and check result of searching")
    public void searchingTest() {
        step("open https://www.luxoft.com/", () -> {
            open("https://www.luxoft.com/");
        });

        step("Click on icon of seacrhing", () -> {
            $(".icomoon-search").shouldBe(visible);
            $(".icomoon-search").click();
        });

        step("Send search request", () -> {
            $("#query-search").setValue("luxoft");
            $("#test").click();
        });
        step("Send search request", () -> {
            $("#query-search").setValue("luxoft");
            $("#test").click();
        });
        step("Response contains query string", () -> {
            $(".search-results__items .search-results__item p").shouldHave(text("luxoft"));
        });

    }

    @Test
    @DisplayName("Home page should have header links")
    void headerTest() {
        step("open https://www.luxoft.com/", () -> {
            open("https://www.luxoft.com/");
        });

        step("Check Services link in header", () -> {
            $(".header__menu a[href='#services']").shouldHave(text("SERVICES"));
        });

        step("Check HomePage link in header", () -> {
            $(".header__menu a[href='#home']").shouldHave(text("HOME"));
        });

        step("Check INDUSTRIES link in header", () -> {
            $(".header__menu a[href='#industries']").shouldHave(text("INDUSTRIES"));
        });

        step("Check Careers link in header", () -> {
            $(".header__menu a[href='#careers']").shouldHave(text("CAREERS"));
        });

        step("Check CONTACT US link in header", () -> {
            $(".header__menu a[href='#contact-us']").shouldHave(text("CONTACT US"));
        });

    }


    @Test
    @DisplayName("Open SideMenu")
    void sideMenuTest() {
        step("open https://www.luxoft.com/", () -> {
            open("https://www.luxoft.com/");
        });

        step("Open side menu", () -> {
            $("#menu-switcher").click();
            $(".lux-menu").shouldBe(visible);
        });


    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.luxoft.com/'", () ->
            open("https://www.luxoft.com/"));

        step("Page title should have text 'Luxoft | Digital Strategy, Consulting and Engineering at Scale'", () -> {
            String expectedTitle = "Luxoft | Digital Strategy, Consulting and Engineering at Scale";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.luxoft.com/'", () ->
            open("https://www.luxoft.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
