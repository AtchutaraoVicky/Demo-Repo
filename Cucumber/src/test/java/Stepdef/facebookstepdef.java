/*
 * package Stepdef;
 * 
 * import java.time.Duration; import java.util.concurrent.TimeUnit;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * 
 * 
 * public class facebookstepdef {
 * 
 * public WebDriver driver;
 * 
 * @Given("browser open") public void browser_open() {
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); }
 * 
 * @And("user in login page") public void user_in_login_page() {
 * 
 * driver.get("https://www.facebook.com"); }
 * 
 * @When("^user enters (.+) and (.+)$") public void
 * user_enters_vasundara_and_test(String username,String password) {
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
 * driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"))
 * .sendKeys(password); }
 * 
 * @And("user clicks on login") public void user_clicks_on_login() {
 * 
 * driver.findElement(By.
 * xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).
 * click(); }
 * 
 * @Then("user is navigated to the home page") public void
 * user_is_navigated_to_the_home_page() {
 * 
 * String exp ="https://www.facebook.com/"; String act =driver.getCurrentUrl();
 * Assert.assertEquals(exp, act);
 * 
 * 
 * } }
 */