package ws.cxf.server.impl;

import bean.UserDTO;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import ws.cxf.server.PersonService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.UUID;

/**
 * @author Administrator
 */
@WebService
public class PersonServiceImpl  implements PersonService{
    @WebMethod
    @Override
    public String getPersonById(String userId) {
        /*UserDTO userDTO = new UserDTO();
        userDTO.setId(UUID.randomUUID().toString().replace("-",""));
        userDTO.setName("yfnihaoa");
        userDTO.setAge(30);
        userDTO.setAddress("高家庄");*/
        return "yfnihaoa";
    }

   /* public static void main(String[] args) {
        // 创建发布服务的类
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
    }*/



}
