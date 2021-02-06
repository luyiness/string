import com.example.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Date:2021/02_10:17 上午
 * @Description：
 */
public class TestUser {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");

        User user = context.getBean("user",User.class);
    }

}
