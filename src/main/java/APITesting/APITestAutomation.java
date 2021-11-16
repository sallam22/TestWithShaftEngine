package APITesting;

import org.testng.annotations.Test;

import com.shaft.api.RestActions.RequestType;
import com.shaft.driver.DriverFactory;

public class APITestAutomation {
	@Test
	public void TestApi() {

		DriverFactory.getAPIDriver("https://cat-fact.herokuapp.com")
		.buildNewRequest("/facts/random", RequestType.GET)
		.setTargetStatusCode(200)

		.performRequest();

	}
}
