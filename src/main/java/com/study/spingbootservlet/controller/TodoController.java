package com.study.spingbootservlet.controller;

import com.study.spingbootservlet.dto.TodoRequestDto;
import com.study.spingbootservlet.dto.TodoRespnoseDto;
import com.study.spingbootservlet.dto.UserResponseDto;
import com.study.spingbootservlet.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// 이게 뭘하는 건가
@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService = new TodoService();
    }
    // 전체 조회
    @GetMapping
    public ResponseEntity<?> getTodo() {
        return ResponseEntity.ok().build();
    }

    //생성
    @PostMapping
    public TodoRespnoseDto creat(@RequestBody TodoRequestDto request){
        return todoService.save(request);
    }


}

