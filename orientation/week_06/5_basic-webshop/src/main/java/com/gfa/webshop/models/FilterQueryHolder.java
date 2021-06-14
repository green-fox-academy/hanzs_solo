package com.gfa.webshop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class FilterQueryHolder {

  String search;
  Boolean inDescription;
  String shortBy;
  Boolean isDescending;
  Boolean availableOnly;
}
