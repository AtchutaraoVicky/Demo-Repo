/*
 * package Stepdef;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert;
 * 
 * import io.cucumber.java.en.*;
 * 
 * public class FBstep { public WebDriver driver;
 * 
 * @Given("open the browser") public void open_the_browser() { driver=new
 * ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); }
 * 
 * @And("user in login page") public void user_in_login_page() {
 * driver.get("https://www.facebook.com"); }
 * 
 * @When("^user enter the login (.+) and(.+)credentional$") public void
 * user_enter_the_login_and_atchutarao_12credentional(String user,String pass) {
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
 * driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"))
 * .sendKeys(pass); }
 * 
 * @And("user click the login btn") public void user_click_the_login_btn() {
 * driver.findElement(By.
 * xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).
 * click(); }
 * 
 * @Then("successfully test completed") public void
 * successfully_test_completed() { String act="https://www.facebook.com/";
 * String exp = driver.getCurrentUrl(); Assert.assertEquals(act, exp);
 * System.out.println("===test pass==="); }
 * 
 * }
 */