import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OneGET {
	
	@Test
	void test_01() {
		Response res = RestAssured.get("http://ip.jsontest.com/");
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		
	}
	
}
