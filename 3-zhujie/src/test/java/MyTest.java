import com.example.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Date:2021/02_11:55 上午
 * @Description：
 */
public class MyTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        User user = context.getBean("user", User.class);
    }

}
