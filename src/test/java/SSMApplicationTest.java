import com.neusoft.pojo.Books;
import com.neusoft.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSMApplicationTest {

    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
}
