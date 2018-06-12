package com.hll.micro.book.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: huangll
 * Written on 18/5/16.
 */
@Getter
@Setter
@Builder
public class Book {

  @ApiModelProperty("图书名")
  private String bookName;

  @ApiModelProperty("图书描述")
  private String bookDesc;
}