package com.gfa.frontend.models.arrayhandler;

import java.util.Arrays;
import lombok.Getter;
import org.apache.tomcat.util.http.fileupload.IOUtils;


@Getter
public class ResultAsNumber {
  Integer result;

  public ResultAsNumber(ArraysIncoming arraysIncoming) {
    result = logic(arraysIncoming.getWhat(), arraysIncoming.getNumbers());
  }

  private Integer logic(String what, Integer[] numbers) {
    switch (what){
      case "sum":
        return Arrays.stream(numbers).mapToInt(x -> x).sum();
      case "multiply":
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }

    return null;
  }
}
