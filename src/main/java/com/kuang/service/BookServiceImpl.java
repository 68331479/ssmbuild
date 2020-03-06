package com.kuang.service;

import com.kuang.mapper.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;

/**
 * @Author: LDeng
 * @Date: 2020-03-03 18:25
 */
public class BookServiceImpl implements BookService {
    //Service 层调Dao层：组装Dao
        private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
