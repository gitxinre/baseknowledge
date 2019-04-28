package com.ly.mybatis.dao;

import com.ly.mybatis.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author Administrator
 * @date 2019/1/3 16:52
 */
public class BookDao implements IBookDao {
    /**
     * 获得图书通过编号
     */

    @Override
    public Book getBookById(int id) {
        //将mybatis的配置文件转换成输入流，读配置文件
        InputStream cfg = this.getClass().getClassLoader().getResourceAsStream("mybatis.xml");
        //根据配置文件构建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(cfg);
        //创建会话
        SqlSession session = factory.openSession();

        //调用方法getBookById带入参数1获得单个图书对象
        Book book = session.selectOne("com.ly.mybatis.dao.BookDao.getBookById", id);
        //关闭会话
        session.close();
        return book;
    }

}
