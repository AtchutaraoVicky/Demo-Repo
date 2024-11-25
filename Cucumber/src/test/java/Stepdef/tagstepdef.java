package Stepdef;

import io.cucumber.java.en.*;

public class tagstepdef {

	
	
	  @Given("print hello") public void print_hello() {
	  System.out.println("hello"); 
	  }
	  
	  @And("print world") public void print_world()
	  {
		  System.out.println("world");
	  }
	  
	  @Given("print java") public void print_java() 
	  { System.out.println("java");
	  }
	  
	  @And("print program") public void print_program()
	  {
	  System.out.println("program");
	  }
	 

}
