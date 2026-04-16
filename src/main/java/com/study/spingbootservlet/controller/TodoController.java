package com.study.spingbootservlet.controller;

import com.study.spingbootservlet.dto.TodoRequestDto;
import com.study.spingbootservlet.dto.TodoResponseDto;
import com.study.spingbootservlet.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
@GetMapping
    public  List<TodoResponseDto> getAll(){
        return todoService.findAll();
    }
@GetMapping("/{id}")
    public  TodoResponseDto getOne(@PathVariable Long id){
        return  todoService.findById(id);
    }
@GetMapping("/user/{userId}")
    public List<TodoResponseDto> getByUser(@PathVariable long userId){
        return todoService.findByUserId(userId);
    }
@PostMapping
    public TodoResponseDto create(@RequestBody TodoRequestDto request){
        return todoService.create(request);
    }
@PutMapping("/{id}")
    public TodoResponseDto update(@PathVariable Long id,@RequestBody TodoRequestDto request){
        return todoService.update(id, request);
    }
@DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        todoService.delete(id);
    }
}
