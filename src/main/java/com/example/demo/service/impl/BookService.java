package com.example.demo.service.impl;

import com.example.demo.bean.Book;
    /**
@author zwh
@create 2023/03/09
*/
public interface BookService{


    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

}
