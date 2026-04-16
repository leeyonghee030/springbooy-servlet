package com.study.spingbootservlet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TodoRequestDto {
    private long userId;
 private String title;
 private boolean completed;
}
