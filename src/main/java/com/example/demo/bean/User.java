package com.example.demo.bean;

import lombok.Data;

/**
@author zwh
@create 2023/02/24
*/

/**
 * user
 */
@Data
public class User {
  /**
   * 主键
   */
  private Integer userId;

  /**
   * 姓名
   */
  private String userName;

  /**
   * 年龄
   */
  private Integer userAge;
}