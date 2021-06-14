package com.gfa.groot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class YondusArrowControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void calculateSpeed_MissingInput_ShouldReturnHttpStatusBadRequestAndRightErrorJson()
      throws Exception {

    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("Send me all data")));

    mockMvc.perform(get("/yondu?distance=500"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("Send me all data")));

    mockMvc.perform(get("/yondu?time=31"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("Send me all data")));
  }

  @Test
  public void calculateSpeed_GivenTimeZero_ShouldReturnHttpStatusBadRequestAndRightErrorJson()
      throws Exception {

    mockMvc.perform(get("/yondu?distance=100&time=0"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("Zero time? Really?")));
  }

  @Test
  public void calculateSpeed_GivenInput_ShouldReturnHttpStatusOkAndRightJson() throws Exception {

    mockMvc.perform(get("/yondu?distance=100&time=10"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("speed", is(10.0)));
  }
}
