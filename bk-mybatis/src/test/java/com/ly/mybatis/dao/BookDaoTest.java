package com.ly.mybatis.dao;

import com.ly.mybatis.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @date 2019/1/4 09:39
 */
public class BookDaoTest {

    @Test
    public void getBookById() throws Exception {
        BookDao dao=new BookDao();
        //输出
        System.out.println(dao.getBookById(3));
        System.out.println("dao = " + dao);
    }

    @Test
    public void testIBookDaoGetBookById() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        IBookDao mapper = session.getMapper(IBookDao.class);
        Book bookById = mapper.getBookById(3);
        session.close();
        System.out.println("bookById = " + bookById);
    }

}