package ge.tbc.tbcacademy.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.tbcacademy.pages.DashboardPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage(); // Could instead be declared in a Test class to expose selectors there.

    @Step("click on draggable section")
    public DashboardSteps clickDraggableSection(SelenideElement element){ // selector passed from outside (test method scope)
        element.shouldNot(Condition.exist);
        element.click();
        // returns this = fluent interface
        return this;
    }

    @Step("Go to film section and do something")
    public DashboardSteps goToFilmAndDoSomething(){
        // Getting the selector from a page object that's initialized within this steps class.
        // Therefore, it won't be visible in the test method.
        dashboardPage.filmLink.click();
        System.out.println("SOMETHING");

        return this;
    }

    @Step("Do something again")
    public DashboardSteps doSomethingAgain(String something){
        System.out.println(something);

        return this;
    }
}
