import com.aming.dao.IProductDao;
import com.aming.domain.Product;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class demo {
    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        IProductDao i = applicationContext.getBean(IProductDao.class);
        List<Product> all = i.findAll();
       for(Product product:all){
           System.out.println(product);
        }
    }
}
