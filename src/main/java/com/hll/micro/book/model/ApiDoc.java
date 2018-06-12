package com.hll.micro.book.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Author: huangll
 * Written on 18/5/22.
 */
@Getter
@Setter
@Builder
@ToString
public class ApiDoc {

  private String name;

  private String path;

  private String method;

  List<Field> parameters;

  List<Field> response;
}
