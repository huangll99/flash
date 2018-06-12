package com.hll.micro.book.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Author: huangll
 * Written on 18/5/22.
 */
@Getter
@Setter
@Builder
@ToString
public class Field {

  private String type;

  private String name;

  private String description;

  private boolean allowEmptyValue;
}
