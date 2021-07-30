package guru.qa.allure;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com";
    }

    private WebSteps steps = new WebSteps();

    @Test
    public void shouldSeeIssueInRepository() {

        steps.openPage();
        steps.searchIssues();
    }

}
