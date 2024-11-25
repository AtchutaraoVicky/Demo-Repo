/*
 * package Stepdef;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert; import
 * io.cucumber.java.en.*;
 * 
 * public class instastepdef {
 * 
 * public WebDriver driver;
 * 
 * @Given("browser open") public void browser_open() { driver=new
 * ChromeDriver(); driver.manage().window().maximize();
 * 
 * }
 * 
 * 
 * @And("user  in login page") public void user_in_login_page() {
 * driver.get("https://www.facebook.com"); }
 * 
 * @When("^user enter the(.+)and (.+)$") public void
 * user_enter_the_user_and_pass(String user, String pass) {
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
 * driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"))
 * .sendKeys(pass); }
 * 
 * @And("user click the loginbtn") public void user_click_the_loginbtn() {
 * driver.findElement(By.
 * xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).
 * click(); }
 * 
 * @Then("user navigate to the homepage") public void
 * user_navigate_to_the_homepage() { String act = "https://www.facebook.com/";
 * String exp = driver.getCurrentUrl(); Assert.assertEquals(act, act);
 * System.out.println("===Test pass==="); }
 * 
 * }
 */