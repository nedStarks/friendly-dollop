package com.example.demo.mapper;

import com.example.demo.bean.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zwh
 * @create 2023/03/09
 */
@Mapper
public interface BookMapper {
  int deleteByPrimaryKey(Integer bookId);

  int insert(Book record);

  int insertSelective(Book record);

  Book selectByPrimaryKey(Integer bookId);

  int updateByPrimaryKeySelective(Book record);

  int updateByPrimaryKey(Book record);
}