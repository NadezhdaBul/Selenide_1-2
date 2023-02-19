import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class HomeworkSelenide {
    @Test
    void enterprise (){
        open("https://github.com/enterprise");
        $(".d-lg-flex").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".col-9-max").$(byText("Build like the best")).shouldHave(text("Build like the best"));
    }

    @Test
    void pryamougolnik () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldBe( text("A"));

    }
}

