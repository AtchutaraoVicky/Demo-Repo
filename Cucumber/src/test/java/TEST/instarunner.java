package TEST;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\Cucumber\\src\\test\\resources\\Features\\Instagram.feature",glue="Stepdef")
public class instarunner {

  public void TC(){
    System.out.println("Insta runner class");

}
  public void TC2(){
	    System.out.println("this is mathod two");
  }
   public void Tc() {
	   System.out.println(" git hub  change the message ");
   }
   public void TC4() {
	   System.out.println(" This is method four ");
   }
}