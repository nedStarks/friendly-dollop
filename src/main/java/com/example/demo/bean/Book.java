package com.example.demo.bean;

import lombok.Data;

/**
@author zwh
@create 2023/03/09
*/

/**
 * 书籍
 */
@Data
public class Book {
  /**
   * 书籍id
   */
  private Integer bookId;

  /**
   * 书名
   */
  private String bookName;

  /**
   * 书籍价格
   */
  private Integer bookPrice;
}