package spring.quickstart;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @date 2018/9/20 17:30
 */
public class MyTestBeanTest {

    BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(""));
}