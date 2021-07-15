package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void setup (){
        Configuration.startMaximized = true;
    }

    @Test
    void dataAppearsInOutputBlockTest () {
        String name = "Viktor";

        open("https://demoqa.com/text-box");
        $x("//div[@class='main-header']").shouldHave(text("Text Box"));

        $x("//input[@id='userName']").setValue(name);
        $x("//input[@id='userEmail']").setValue("Viktor@sdf.by");
        $x("//textarea[@id='currentAddress']").setValue("Gomel");
        $x("//textarea[@id='permanentAddress']").setValue("Minsk");
        $x("//button[@id='submit']").click();

        $x("//div[@id='output']").shouldHave(text(name),text("Viktor@sdf.by"));
    }

    @Test
    void testStructure() {
        // arrange  | given  |  подготовка

        // act      | when   |  действие

        // assert   | then   |  проверка
    }
}
