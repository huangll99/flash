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
public class Model {

  private String name;

  List<Field> fields;
}
