package hello;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControlerTest {
//
//    @LocalServerPort
//    private int port;
//
//    private URL base;
//
//    @Autowired
//    private TestRestTemplate template;

//    @Before
//    void setUp() throws Exception {
//        this.base = new URL("http://localhost:" + port + "/");
//    }
//
//    @Test
//    void getHello() throws Exception {
//        ResponseEntity<String> response = template.getForEntity(base.toString(),
//                String.class);
//        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
//    }

}
