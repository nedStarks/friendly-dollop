package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @author zwh
 * @create 2023/02/24
 */
public class UserMapperTest {
  private static UserMapper mapper;

  @BeforeClass
  public static void setUpMybatisDatabase() {
    org.apache.ibatis.session.SqlSessionFactory builder = new org.apache.ibatis.session.SqlSessionFactoryBuilder().build(UserMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/UserMapperTestConfiguration.xml"));
    //you can use builder.openSession(false) to not commit to database
    mapper = builder.getConfiguration().getMapper(UserMapper.class, builder.openSession(true));
  }

  @Test
  public void testSelectAllByUserName() {
    List<User> list = mapper.selectAllByUserName("张三");
    for (User user : list) {
      
    }
    for(User user : list){
      System.out.println(user);
    }
    for (int i = 0; i < 10; i++) {

    }
    boolean flag = true;
    while (flag) {
      User user = new User();

    }
  }
}
