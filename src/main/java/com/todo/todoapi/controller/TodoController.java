package com.todo.todoapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class TodoController {

    @GetMapping(value = "/todolist", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getTodos(){
        return new ArrayList<>();
    }


}
