package com.automated.testing.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private UserController userController;

    @Test
    public void testNotNull() {
        assertThat(userController, notNullValue());
    }

    @Test
    public void getStudentById() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/students/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("name", is("wh")))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void listStudents() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/students")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    void insertStudent() throws Exception {
        String requestBody = "{\"id\":1, \"name\":\"wh\"}";
        mvc.perform(MockMvcRequestBuilders.post("/students")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void updateStudent() throws Exception {
        String requestBody = "{\"id\":1, \"name\":\"wh\"}";
        mvc.perform(MockMvcRequestBuilders.put("/students")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void deleteStudent() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/students/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}