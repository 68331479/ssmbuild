package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

/**
 * @Author: LDeng
 * @Date: 2020-03-03 18:23
 */
public interface BookService {

    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
