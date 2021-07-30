package guru.qa.allure;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    public void testRepositoryIssue() {
        open("/rinchy0l0/homeworkthree");
        $(".UnderlineNav-body").shouldHave(text("Issues"));
    }
}