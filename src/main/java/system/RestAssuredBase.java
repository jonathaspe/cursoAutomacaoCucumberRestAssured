package system;

import org.apache.http.HttpStatus;
import static io.restassured.RestAssured.*;

public class RestAssuredBase {
    public static void setup(String url){
        enableLoggingOfRequestAndResponseIfValidationFails(); //para gerar a impressão de erros
        baseURI = url;
        given().when().get().then().assertThat().statusCode(HttpStatus.SC_OK);
    }
}
