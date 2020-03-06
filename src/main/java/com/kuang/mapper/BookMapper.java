package com.kuang.mapper;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: LDeng
 * @Date: 2020-03-03 18:02
 */
@Mapper
public interface BookMapper {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(@Param("bookid") int id);
    //更新
    int updateBook(Books books);
    //修改
    Books queryBookById(@Param("bookid")int id);
    //查询全部
    List<Books> queryAllBook();

}
