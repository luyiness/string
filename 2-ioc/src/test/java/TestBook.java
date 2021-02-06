import com.example.Book;
import com.example.Library;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Date:2021/02_10:39 上午
 * @Description：
 */
public class TestBook {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");

        Library library = context.getBean("library", Library.class);
    }
}
