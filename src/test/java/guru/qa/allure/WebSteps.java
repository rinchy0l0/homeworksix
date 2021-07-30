package guru.qa.allure;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открыть репозиторий")
    public void openPage() {
        open("/rinchy0l0/homeworkthree");
    }

    @Step("Проверить, что Issues существует в репозитории")
    public void searchIssues() {
        $(".UnderlineNav-body").shouldHave(text("Issues"));
    }
}