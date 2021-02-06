import com.example.jdbc.entity.Admin;
import com.example.jdbc.service.AdminService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Date:2021/02_2:03 下午
 * @Description：
 */
public class Test {

    @org.junit.Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        AdminService adminService = context.getBean("adminService", AdminService.class);

        //adminService.add(new Admin(null, "aaa", "ccc"));

        //adminService.delete(1);

        List<Admin> all = adminService.findAll();
        System.out.println(all);

        System.out.println(adminService.findOne(2));

//        adminService.update(new Admin(null, "aasdfsda", "ccsdfc"),2);
    }

}
