package in.co.gorest.testbase;
/* 
 Created by Kalpesh Patel
 */


import in.co.gorest.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        //RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        //RestAssured.basePath = Path.PRODUCTS;
    }
}
