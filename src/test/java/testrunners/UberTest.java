
  package testrunners;
  
  import org.junit.runner.RunWith;
  
  import io.cucumber.junit.Cucumber; 
  import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)  
  @CucumberOptions( 
		  features = {"src/test/resources/appFeatures/Uber.feature"}, 
		  glue =  {"stepDefinitions"}, 
		  tags = "smoke", 
		  plugin = {"pretty",
				  "json:target/MyReports/report.json",
				  "junit:target/MyReports/report.xml"
				  },
		  dryRun = true
		  )
  
  public class UberTest {
  
  }
 
