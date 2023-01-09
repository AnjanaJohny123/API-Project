package ShopNoAuth;

import libraries.BaseTest;
import models.CreateProductClass;
import org.testng.annotations.Test;

public class UpdateRequest extends BaseTest {
    @Test
    public void verifyUpdateRequest() {
        String userID="a81edaa9-526f-4608-bbba-1eabd9b38e57";
        CreateProductClass product = new CreateProductClass();
        product.setName("Blue Whale The Original Backpack - Redwood");
        product.setDescription("With padded laptop compartment");
        product.setPrice(60f);

        spec.basePath("api/v1/products/"+userID)
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
