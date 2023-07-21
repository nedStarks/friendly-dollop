package com.example.demo.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.demo.bean.User;

/**
@author zwh
@create 2023/02/24
*/
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllByUserAgeAndUserName(@Param("userAge")Integer userAge,@Param("userName")String userName);

    List<User> selectAllByUserName(@Param("userName")String userName);
}