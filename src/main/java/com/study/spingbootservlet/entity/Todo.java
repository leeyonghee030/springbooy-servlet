package com.study.spingbootservlet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private Long id;       // DB: BIGINT
    private Long userId;   // DB: BIGINT
    private String title;  // DB: VARCHAR
    private boolean completed; // DB: TINYINT(1) or BOOLEAN

    public Todo(Long userId, String title) {
        this.userId = userId;
        this.title = title;
        this.completed = false;
    }
}
