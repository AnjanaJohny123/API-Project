package ShopNoAuth;

import libraries.BaseTest;
import org.testng.annotations.Test;

public class DeleteRequest extends BaseTest {
    @Test
    public void verifyDeleteRequest() {
        String userID="ba30c82b-e7e7-479b-8202-fc56efe3973f";

        spec.basePath("api/v1/products/"+userID)
                .when()
                .delete()
                .then()
                .assertThat()
                .statusCode(204)
                .log()
                .all();

    }
}
