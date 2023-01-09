package shopBasicAuth;

import libraries.BaseTest;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.Test;

public class GetallProductsBasicAuth extends BaseTest {
    @Test
    public void verifyGetAllProductsBasicAuth() {

        spec.basePath("/api/v1/products")
                .auth()
                .basic("david", "david123")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .body("[1].name", CoreMatchers.containsString("Hamilton"))
                .header("Content-Type", "application/json");


    }
}
