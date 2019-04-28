package com.ly.mybatis.dao;

import com.ly.mybatis.model.Book;

/**
 * @author Administrator
 * @date 2019/1/4 11:10
 */
public interface IBookDao {

    Book getBookById(int id);
}
