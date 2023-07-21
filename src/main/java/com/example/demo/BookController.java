package com.example.demo;
import com.example.demo.bean.Book;
import com.example.demo.service.BookServiceImplImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (book)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/book")
public class BookController {
/**
* 服务对象
*/
@Resource
private BookServiceImpl bookServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Book selectOne(Integer id) {
return bookServiceImpl.selectByPrimaryKey(id);
}

}
