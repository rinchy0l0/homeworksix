package guru.qa.allure;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepTest {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    public void testRepositoryIssue() {
        step("Открыть репозиторий", () -> {
            open("/rinchy0l0/homeworkthree");

        });

        step("Проверить, что Issues существует в репозитории", () -> {
            $(".UnderlineNav-body").shouldHave(text("Issues"));
        });

    }
}