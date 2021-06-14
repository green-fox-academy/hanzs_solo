package com.gfa.frontend.models.arrayhandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;

@Getter
public class ResultAsArray {
  Integer[] result;

  public ResultAsArray(ArraysIncoming arraysIncoming) {
    result = logic(arraysIncoming.getNumbers());
  }

  private Integer[] logic(Integer[] numbers) {
    List<Integer> temp = new ArrayList<>();
    for (Integer number : numbers){
      temp.add(number*2);
    }
    return temp.toArray(new Integer[0]);
  }
}
