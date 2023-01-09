package shopBasicAuth;

import libraries.BaseTest;
import models.CreateProductClass;
import org.testng.annotations.Test;

public class UpdateRequestBasicAuth extends BaseTest {
    @Test
    public void verifyUpdateRequest() {
        String userID=        "d2a2b49c-c514-44c4-a3a5-5fcb40da70fd";
        CreateProductClass product = new CreateProductClass();
        product.setName("Hamilton Beach Insulated Superman printed Bottle, 355 ml");
        product.setDescription("Superman printed Bottle");
        product.setPrice(85.98f);

        spec.basePath("api/v1/products/"+userID)
                .auth()
                .basic("david","david123")
                .body(product)
                .when()
                .put()
                .then()
                .assertThat()
                .statusCode(204)
                .log()
                .all();

    }
}
