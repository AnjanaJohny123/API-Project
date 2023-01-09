package shopBasicAuth;

import libraries.BaseTest;
import models.CreateProductClass;
import org.testng.annotations.Test;

public class DeleteRequestBasicAuth extends BaseTest {
    @Test
    public void deleteRequestBasicAuth() {
        String userID="44c7208d-8742-4246-937a-fc45874b261c";

        spec.basePath("api/v1/products/"+userID)
                .auth()
                .basic("david","david123")
                .when()
                .delete()
                .then()
                .assertThat()
                .statusCode(204)
                .log()
                .all();

    }
}
