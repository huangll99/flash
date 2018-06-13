package com.hll.micro.book.controller;

import com.alibaba.fastjson.JSON;
import com.hll.micro.book.model.Book;
import com.hll.micro.book.model.Result;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Author: huangll
 * Written on 18/5/16.
 */
@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {

  @Value("${username}")
  private String username;

  @Value("${password}")
  private String password;


  @ApiOperation("图书添加")
  @PostMapping("/add")
  public Result addBook(@RequestBody Book book) {
    log.info(JSON.toJSONString(book));
    return Result.builder().success(true).msg("ok").build();
  }

  @ApiOperation(("获取图书"))
  @GetMapping("/get")
  public Book getBook() {
    log.info(username);
    log.info(password);
    return Book.builder().bookName("微服务实战").bookDesc("这是一本关于微服务实战的图书").build();
  }
}
