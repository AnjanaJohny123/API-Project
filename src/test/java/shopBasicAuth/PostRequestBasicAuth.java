package shopBasicAuth;

import libraries.BaseTest;
import models.CreateProductClass;
import org.testng.annotations.Test;

public class PostRequestBasicAuth extends BaseTest {
    @Test
    public void postRequestUsingPOJOBasicAuth() {
        CreateProductClass product = new CreateProductClass();
        product.setName("Scissors");
        product.setDescription("Black Long Scissors");
        product.setPrice(10f);

        spec.basePath("/api/v1/products")
                .auth()
                .basic("david","david123")
                .body(product)
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(201)
                .log()
                .all();

    }
}
