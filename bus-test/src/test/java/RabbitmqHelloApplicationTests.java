import com.lasi.demo.BusTestApplication;
import com.lasi.demo.service.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by cys on 2017/11/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BusTestApplication.class)
public class RabbitmqHelloApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void contextLoads() {
        sender.send();
    }
}
