package common.Bean;

import org.mybatis.spring.SqlSessionFactoryBean;

import javax.sql.DataSource;
import java.sql.SQLException;

public class SqlSessionFactoryBeanBpmn extends SqlSessionFactoryBean {

    public void a (){

        DataSource ds = null;
        try {
            ds.getConnection().getMetaData().getDatabaseProductName();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
