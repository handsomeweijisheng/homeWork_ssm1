package com.wjs.listener;

import com.wjs.dao.GoodsDao;
import com.wjs.dao.TypeDao;
import com.wjs.pojo.Goods;
import com.wjs.pojo.Type;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

/**
 * @author wjs
 * @create 2022-03-01 16:14
 */
//通过监听器直接加载类别
public class TypeListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_dao.xml");
        TypeDao bean = context.getBean(TypeDao.class);
        List<Type> typeList = bean.findAll();
        //对类型的查询
        typeList.forEach(s -> {
            System.out.println(s);
        });
        //GoodsDao goodsDao = context.getBean(GoodsDao.class);
        //List<Goods> selectAll = goodsDao.selectAll();
        //对所有商品的查询
        //selectAll.forEach(c->{
        //    System.out.println(c);
        //});
        //发送typelist类型的数据
        servletContextEvent.getServletContext().setAttribute("typeList", typeList);
        //    发送所有商品类型的数据
        //    servletContextEvent.getServletContext().setAttribute("goodAll",selectAll);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
