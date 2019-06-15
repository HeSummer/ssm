import com.aming.dao.IProductDao;
import com.aming.domain.Product;
import com.aming.service.IProductService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class demo {
    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-service.xml","applicationContext-dao.xml");
        IProductService i = applicationContext.getBean(IProductService.class);
        List<Product> all = i.findAll();
       for(Product product:all){
           System.out.println(product);
        }
    }
}
