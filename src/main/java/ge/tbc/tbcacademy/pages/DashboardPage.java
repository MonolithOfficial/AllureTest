package ge.tbc.tbcacademy.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DashboardPage extends BasePage {
    public final SelenideElement draggableSection = $x("//section[@class='container']//div[@class='slick-list draggable']");
}
