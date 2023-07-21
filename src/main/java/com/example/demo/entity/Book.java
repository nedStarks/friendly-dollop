package com.example.demo.entity;

import java.io.Serializable;

/**
 * 书籍(Book)实体类
 *
 * @author makejava
 * @since 2023-03-08 17:10:22
 */
public class Book implements Serializable {
  private static final long serialVersionUID = -17999278631776685L;
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


  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public Integer getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(Integer bookPrice) {
    this.bookPrice = bookPrice;
  }

}

