package com.example.spring.Test;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private int todoCount = 3;

    static {
        todos.add(new Todo(1,"Jack","Learn Spring MVC", new Date(),false));
        todos.add(new Todo(2,"Jack","Learn Struct", new Date(),false));
        todos.add(new Todo(3,"Jill","Learn Hibernate", new Date(),false));
    }
    @Cacheable(cacheNames = "todos", condition = "#user.length < 10")
    public List<Todo> retrieveTodos(String user){
        List<Todo> filterTodos = new ArrayList<>();
        for(Todo todo : todos){
            if(todo.getUser().equals(user))
                filterTodos.add(todo);
        }
        return filterTodos;
    }

    Todo addTodo(String name, String desc, Date targetDate, boolean isDone){
        Todo todo = new Todo(todoCount,name,desc,targetDate,isDone);
        todos.add(todo);
        return todo;
    }

    Todo retrieveTodo(int id){
        for(Todo todo : todos){
            if(todo.getId() == id)
                return todo;
        }
        return null;
    }
}
