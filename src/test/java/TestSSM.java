import com.wjs.dao.GoodsDao;
import com.wjs.dao.TestDao;
import com.wjs.dao.TypeDao;
import com.wjs.pojo.Goods;
import com.wjs.pojo.Test;
import com.wjs.pojo.Type;
import com.wjs.service.TypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author wjs
 * @create 2022-02-28 14:39
 */
public class TestSSM {
    public static void main(String[] args) {
      ApplicationContext context=new ClassPathXmlApplicationContext("application_dao.xml");
     /*   TestDao bean = context.getBean(TestDao.class);
        List<Test> all = bean.findAll();
        System.out.println(all);*/
        //GoodsDao bean = context.getBean(GoodsDao.class);
        //List<Goods> goods = bean.selectAll();
        //goods.forEach(s-> System.out.println(s));
        /*TypeDao bean = context.getBean(TypeDao.class);
        List<Type> all = bean.findAll();
        all.forEach(s-> System.out.println(s));*/
       /* TypeDao bean = context.getBean(TypeDao.class);
        List<Type> all = bean.findAll();
        all.forEach(s->{
            System.out.println(s);
        });*/
        GoodsDao bean = context.getBean(GoodsDao.class);
        List<Goods> goods = bean.selectAll();
        System.out.println(goods);
    }
}
