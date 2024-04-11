package ge.tbc.tbcacademy.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    public SelenideElement filmLink = $x("//a[div[contains(@class, 'MenuIcon')] and normalize-space() = 'კინო']");
}
