package com.rbc.controller;

import com.rbc.util.TodoGen;
import com.rbc.model.Todo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    @RequestMapping(value = "/api/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/api/todo")
    public @ResponseBody
    List<Todo> todo() {
        return TodoGen.TodoListcreate();
    }


}
