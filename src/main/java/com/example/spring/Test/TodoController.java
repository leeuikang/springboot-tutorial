package com.example.spring.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/users/{name}/todos/{id}")
    Todo retrieveTodo(@PathVariable String name, @PathVariable int id){
        Todo todo = todoService.retrieveTodo(id);
        if(todo == null)
            throw new TodoNotFoundException("test ExceptionHandler2");
        return todo;
    }
}
