//package stepDefinitions.UI_StepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import pages.ViceDeanPage;
//import utilities.Driver;
//
//import static org.junit.Assert.assertTrue;
//import static utilities.WaitUtils.waitFor;
//
//
//
//public class US_10_mertcan_UI_StepDefs {
//
//    ViceDeanPage viceDeanPage = new ViceDeanPage();
//
//
//    @Given("navigate homepage_MM")
//    public void navigate_homepage_MM() {
//        Driver.getDriver().get("https://managementonschools.com/");
//        waitFor(2);
//
//    }
//    @When("click on Login button_MM")
//    public void click_on_Login_button_MM() {
//
//        viceDeanPage.login.click();
//
//        waitFor(2);
//
//    }
//    @When("enter name {string}_MM")
//    public void enter_name_MM(String string) {
//
//
//        us_10_viceDean_management_page.userName.sendKeys("TonyStark123");
//
//        waitFor(2);
//
//    }
//    @When("submit password {string}_MM")
//    public void enter_password_MM(String string) {
//
//        viceDeanPage.password.sendKeys("TonyStark123");
//
//        us_10_viceDean_management_page.password.sendKeys("TonyStark123");
//
//        waitFor(2);
//
//    }
//    @When("click login button_MM")
//    public void click_login_button_MM() {
//
//        viceDeanPage.loginbutton.click();
//
//        us_10_viceDean_management_page.loginbutton.click();
//
//        waitFor(2);
//    }
//    @Then("verify user logged in_MM")
//    public void verify_user_logged_MM() {
//
//        assertTrue(viceDeanPage.verifyUsername.getText().contains("TonyStark123"));
//
//        assertTrue(us_10_viceDean_management_page.verifyUsername.getText().contains("TonyStark123"));
//
//
//
//    }
//
//
//    //TC_02
//    @When("click menu button_MM")
//    public void click_menu_button_MM() {
//
//        viceDeanPage.menuButton.click();
//
//        us_10_viceDean_management_page.menuButton.click();
//
//        waitFor(2);
//
//    }
//    @When("click choose lesson management button_MM")
//    public void click_choose_lesson_management_button_MM() {
//
//        viceDeanPage.lessonmanagament.click();
//
//        us_10_viceDean_management_page.lessonmanagament.click();
//
//        waitFor(2);
//    }
//    @When("click lesson program_MM")
//    public void click_lesson_program_MM() {
//
//        viceDeanPage.lessonProgram.click();
//
//        us_10_viceDean_management_page.lessonProgram.click();
//
//
//    }
//    @When("click choose lesson button_MM")
//    public void click_choose_lesson_button_MM() {
//
//        viceDeanPage.chooselessonbutton.click();
//
//        us_10_viceDean_management_page.chooselessonbutton.click();
//
//        waitFor(2);
//    }
//    @Then("choose lesson_MM")
//    public void choose_lesson_MM() {
//
//        viceDeanPage.java.click();
//
//        us_10_viceDean_management_page.java.click();
//
//
//    }
//
//
//    //TC_03
//    @When("click {string}_MM")
//    public void click_MM(String string) {
//
//        viceDeanPage.chooseeducationterm.click();
//        viceDeanPage.semesterselected.click();
//
//        us_10_viceDean_management_page.chooseeducationterm.click();
//        us_10_viceDean_management_page.semesterselected.click();
//
//        waitFor(2);
//
//    }
//
//    @When("choose day_MM")
//    public void choose_choose_day_MM() {
//
//        viceDeanPage.chooseday.click();
//        viceDeanPage.fridayselected.click();
//
//        us_10_viceDean_management_page.chooseday.click();
//        us_10_viceDean_management_page.fridayselected.click();
//
//        waitFor(2);
//
//    }
//    @Then("choose start time_MM")
//    public void click_start_time_MM() {
//
//        viceDeanPage.starttime.sendKeys("09:00PM");
//
//        us_10_viceDean_management_page.starttime.sendKeys("09:00PM");
//
//        waitFor(2);
//    }
//
//    @Then("choose stop time_MM")
//    public void click_stop_time_MM() {
//
//        viceDeanPage.stoptime.sendKeys("11.00PM");
//
//        us_10_viceDean_management_page.stoptime.sendKeys("11.00PM");
//
//        waitFor(2);
//
//    }
//    @Then("click submit button_MM")
//    public void click_submit_button_MM() {
//
//        viceDeanPage.submitButtonlesprog.click();
//
//        us_10_viceDean_management_page.submitButtonlesprog.click();
//
//        waitFor(2);
//
//
//    }
//    @Then("verify submit button clicked_MM")
//    public void verify_submit_button_clicked_MM() {
//
//        assertTrue(viceDeanPage.submitButtonlesprog.isDisplayed());
//
//        assertTrue(us_10_viceDean_management_page.submitButtonlesprog.isDisplayed());
//
//    }
//}
