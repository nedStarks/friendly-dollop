package com.example.demo.mapper;

import com.example.demo.bean.Person;

/**
@author zwh
@create 2023/02/24
*/
public interface PersonMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer personId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}