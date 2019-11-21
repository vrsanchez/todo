package com.todo.todoapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(TodoController.class)
public class TodoControllerUnitTest {
    @Autowired
    private MockMvc mvcInvoker;


    @Test
    public void getEmptyTodoList() throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/api/todolist").contentType(MediaType.APPLICATION_JSON);

        mvcInvoker.perform(builder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
