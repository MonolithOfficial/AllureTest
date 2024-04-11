package ge.tbc.tbcacademy;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import ge.tbc.tbcacademy.listeners.CustomTestListener;
import ge.tbc.tbcacademy.pages.DashboardPage;
import ge.tbc.tbcacademy.steps.DashboardSteps;
import ge.tbc.tbcacademy.util.ModdedAllureSelenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import com.codeborne.selenide.testng.ScreenShooter;

import static com.codeborne.selenide.Selenide.open;

@Test(description = "Dashboard tests")
@Listeners({CustomTestListener.class})
public class DashboardTests {
    DashboardPage dashboardPage; // declaration of a page object
    DashboardSteps dashboardSteps;
    @BeforeClass
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new ModdedAllureSelenide());
        dashboardPage = new DashboardPage(); // initialization of a page object
        dashboardSteps = new DashboardSteps(); // initialization of a step object

        Configuration.browser = "chrome";
        Configuration.timeout = 10;
//        Configuration.holdBrowserOpen = true;
        WebDriverManager.chromedriver().setup();
        open("https://swoop.ge");
    }

    @Test(description = "Testing going to a section functionality")
    @Link("https://somekindoffakejira.com/SQDTBC-12345")
    @Severity(SeverityLevel.BLOCKER)
    public void goToSection() {
        dashboardSteps
                .clickDraggableSection(dashboardPage.draggableSection) // visible selector
                .goToFilmAndDoSomething() // invisible selector -> do as you wish ᕦ(ò_óˇ)ᕤ
                .doSomethingAgain("something");
    }
}
