package com.gfa.groot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CargoControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void getShipStatus_atServerStart_shouldReturnDefaultStatus() throws Exception {

    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("caliber25", is(0)))
        .andExpect(jsonPath("caliber30", is(0)))
        .andExpect(jsonPath("caliber50", is(0)))
        .andExpect(jsonPath("shipstatus", is("empty")))
        .andExpect(jsonPath("ready", is(false)));
  }

  @Test
  public void fillShip_missingParameters_shouldReturnHttpStatusBadRequestAndErrorMessage() throws Exception {

    mockMvc.perform(post("/rocket/fill?"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("you have to provide both data")));

    mockMvc.perform(post("/rocket/fill?caliber=.50"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("you have to provide both data")));

    mockMvc.perform(post("/rocket/fill?amount=10"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("you have to provide both data")));
  }

  @Test
  public void fillShip_badParameters_shouldReturnHttpStatusBadRequestAndErrorMessage() throws Exception {

    mockMvc.perform(post("/rocket/fill?caliber=kiskacsa&amount=10"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("caliber not supported")));

    mockMvc.perform(post("/rocket/fill?caliber=.30&amount=0"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("you have to fill ship with a positive amount of ammo")));

    mockMvc.perform(post("/rocket/fill?caliber=.30&amount=-300"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error", is("you have to fill ship with a positive amount of ammo")));
  }

  @Test
  public void fillShip_goodParameters_shouldReturnHttpStatusOkAndExpectedJson() throws Exception {

    mockMvc.perform(post("/rocket/fill?caliber=.25&amount=125"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("recieved", is(".25")))
        .andExpect(jsonPath("amount", is(125)))
        .andExpect(jsonPath("shipstatus", is("1%")))
        .andExpect(jsonPath("ready", is(false)));

    mockMvc.perform(post("/rocket/fill?caliber=.30&amount=125"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("recieved", is(".30")))
        .andExpect(jsonPath("amount", is(125)))
        .andExpect(jsonPath("shipstatus", is("2%")))
        .andExpect(jsonPath("ready", is(false)));

    mockMvc.perform(post("/rocket/fill?caliber=.50&amount=12250"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("recieved", is(".50")))
        .andExpect(jsonPath("amount", is(12250)))
        .andExpect(jsonPath("shipstatus", is("full")))
        .andExpect(jsonPath("ready", is(true)));

    mockMvc.perform(post("/rocket/fill?caliber=.50&amount=125"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("recieved", is(".50")))
        .andExpect(jsonPath("amount", is(125)))
        .andExpect(jsonPath("shipstatus", is("overloaded")))
        .andExpect(jsonPath("ready", is(false)));
  }

  @Test
  public void getShipStatus_afterFilling_shouldReturnRightStatus() throws Exception {

    mockMvc.perform(post("/rocket/fill?caliber=.25&amount=125"));

    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("caliber25", is(125)))
        .andExpect(jsonPath("caliber30", is(0)))
        .andExpect(jsonPath("caliber50", is(0)))
        .andExpect(jsonPath("shipstatus", is("1%")))
        .andExpect(jsonPath("ready", is(false)));

    mockMvc.perform(post("/rocket/fill?caliber=.30&amount=125"));

    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("caliber25", is(125)))
        .andExpect(jsonPath("caliber30", is(125)))
        .andExpect(jsonPath("caliber50", is(0)))
        .andExpect(jsonPath("shipstatus", is("2%")))
        .andExpect(jsonPath("ready", is(false)));

    mockMvc.perform(post("/rocket/fill?caliber=.50&amount=125"));

    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("caliber25", is(125)))
        .andExpect(jsonPath("caliber30", is(125)))
        .andExpect(jsonPath("caliber50", is(125)))
        .andExpect(jsonPath("shipstatus", is("3%")))
        .andExpect(jsonPath("ready", is(false)));

    mockMvc.perform(post("/rocket/fill?caliber=.50&amount=125"));

    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("caliber25", is(125)))
        .andExpect(jsonPath("caliber30", is(125)))
        .andExpect(jsonPath("caliber50", is(250)))
        .andExpect(jsonPath("shipstatus", is("4%")))
        .andExpect(jsonPath("ready", is(false)));

    mockMvc.perform(post("/rocket/fill?caliber=.50&amount=12000"));

    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("caliber25", is(125)))
        .andExpect(jsonPath("caliber30", is(125)))
        .andExpect(jsonPath("caliber50", is(12250)))
        .andExpect(jsonPath("shipstatus", is("full")))
        .andExpect(jsonPath("ready", is(true)));
  }
}
