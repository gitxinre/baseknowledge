package ws.cxf.server.impl;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import ws.cxf.server.PersonService;

import javax.xml.ws.Endpoint;

import static org.junit.Assert.*;

public class PersonServiceImplTest {

    public static void main(String[] args) {
        /*// 创建发布服务的类
        ServerFactoryBean serverFactoryBean = new ServerFactoryBean();
        // 设置服务地址，即对外访问的地址
        serverFactoryBean.setAddress("http://192.168.9.174:9005/personService");
        // 设置服务类的接口类型，如果服务类没有实现接口，则为当前类
        serverFactoryBean.setServiceClass(PersonService.class);
        // 设置提供服务的类
        serverFactoryBean.setServiceBean(new PersonServiceImpl());

        // 拦截请求的数据信息
        serverFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
        // 添加相应的消息拦截器
        serverFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        // 发布服务
        serverFactoryBean.create();
        System.out.println("发布成功！");*/

        Endpoint.publish("http://192.168.9.174:9090/personService", new PersonServiceImpl());

        //创建发布服务的类
        JaxWsServerFactoryBean bean=new JaxWsServerFactoryBean();
        //设置服务对外的访问路径
        //soap1.2
        bean.setAddress("http://192.168.9.174:8989/makeService");
        bean.setServiceClass(PersonService.class);
        bean.setServiceBean(new PersonServiceImpl());
        //拦截请求的数据...
        bean.getInInterceptors().add(new LoggingInInterceptor());
        //添加响应的消息拦截器....
        bean.getOutInterceptors().add(new LoggingOutInterceptor());

        bean.create();

    }

}