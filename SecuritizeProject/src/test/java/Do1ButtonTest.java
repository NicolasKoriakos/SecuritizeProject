import org.testng.annotations.Test;

public class Do1ButtonTest extends BaseTest{

    @Test
    public void do1ButtonTest(){
        homePage.login("admin", "admin");
    }
}
