package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        		features= {".//features"},
                glue="stepDefinitions",
                plugin= {"pretty",
                        "html:reports/myreport.html",
                        "json:reports/myreport.json",
                        "rerun:target/rerun.txt",
                        //Mandatory to capture failures
                },
                dryRun=false,
                
                monochrome=true,
                  tags="@Create"
                //tags = "@sanity"//Scenarios tagged with @sanity but not tagged with @regression
        )

public class TestRunner {

}

