import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class OneGET {
	
	@Test
	void test_01() {
		Response res = get("http://ip.jsontest.com/");
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		 Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	@Test
	void test_02() {
	
		 given().
		     get("http://ip.jsontest.com/")
		 .then()
		     .statusCode(200);
	}
	
}
