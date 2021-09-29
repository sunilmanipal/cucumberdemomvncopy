package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class definition {
	WebDriver driver;
	@Given("Login page")
	public void login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chrome driver 91\\chromedriver.exe");
		//i am trying to create a new instance of chrome driver
	    driver = new ChromeDriver();
	    //WedDriver driver - new ChromeDriver()
	    //ChromeDriver driver = new ChromeDriver()
	    //i want to be the login page //what should i do
	    driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("Enter Valida name {string}")
	public void enter_valida_name(String name) {
		 driver.findElement(By.id("txtUsername")).sendKeys(name);
	}
	@When("Enter valid password {string}")
	public void enter_valid_password(String pwd) {
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}
	@When("Click on submit button")
	public void click_on_submit_button() {
		   driver.findElement(By.id("btnLogin")).click();
	}
	@Then("IShould see the userName as {string}")
	public void i_should_see_the_user_name_as(String LoginName) throws InterruptedException {
		String Actual = driver.findElement(By.id("welcome")).getText();
		   String Expected = LoginName;
		   Assert.assertEquals(Expected, Actual);
		   //i will logout
		   driver.findElement(By.id("welcome")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
		   System.out.println("I am Succesfull logout");
		   Thread.sleep(3000);
		   
		   driver.quit();
	}

	@When("Enter InValida name {string}")
	public void enter_in_valida_name(String invalidname) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("txtUsername")).sendKeys(invalidname);
	}


	

	@When("Enter Invalid password {string}")
	public void enter_invalid_password(String invalidpwd) {
		driver.findElement(By.id("txtPassword")).sendKeys(invalidpwd);
	    
	}
	@Then("I Should see the Invalid Credentail as {string}")
	public void i_should_see_the_invalid_credentail_as(String loginname) {
	    String Actual = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	    String Expected =loginname;
	    Assert.assertEquals(Expected, Actual);
	    System.out.println("Invalid data");
	    
	}




}
