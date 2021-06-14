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
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doIntroduction_MissingInput_ShouldResponseHttpStatusBadRequestAndRightError() throws Exception {

    mockMvc
        .perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("I am Groot!")));
  }

  @Test
  public void doIntroduction_GivenInput_ShouldResponseWithHttpStatusOkAndRightJson() throws Exception {

    String message = "disznószar";

    mockMvc
        .perform(get("/groot?message="+message))
        .andExpect(status().isOk())
        .andExpect(jsonPath("received", is(message)))
        .andExpect(jsonPath("translated", is("I am "+message+"!")));
  }

}
