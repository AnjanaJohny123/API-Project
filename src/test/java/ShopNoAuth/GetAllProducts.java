package ShopNoAuth;

import libraries.BaseTest;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.Test;

public class GetAllProducts extends BaseTest {
    @Test
    public void verifyGetAllProducts() {

        spec.basePath("/api/v1/products")

                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .body("[0].name", CoreMatchers.containsString("Thermos"))
                .header("Content-Type", "application/json");


    }


}
