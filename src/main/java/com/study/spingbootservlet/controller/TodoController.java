package com.study.spingbootservlet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 이게 뭘하는 건가
@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    // 전체 조회
    @GetMapping
    public ResponseEntity<?> getTodo() {
        return ResponseEntity.ok().build();
    }
}
