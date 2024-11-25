package TEST;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\Cucumber\\src\\test\\resources\\Features\\tag.feature",glue="Stepdef",tags="@smoketest")
public class tagrunner {
   public void TC(){
   System.out.println("Tag runner class passed");
      System.out.println("add to git hub account ");
}
}
