package ws.cxf.server.impl;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import ws.cxf.server.IPeople;

import static org.junit.Assert.*;

public class PeopleImplTest {

    public static void main(String[] args) {


        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        jaxrsServerFactoryBean.setAddress("http://127.0.0.1:12223/cxf_jaxrs_server");
        jaxrsServerFactoryBean.setServiceClass(PeopleImpl.class);
        jaxrsServerFactoryBean.setServiceBean(new PeopleImpl());
        jaxrsServerFactoryBean.create();
        System.out.println("成功");

    }

}