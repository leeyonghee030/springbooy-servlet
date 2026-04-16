package com.study.spingbootservlet.dto;

import com.study.spingbootservlet.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoRequestDto {
    TodoRequestDto todoRequestDto;

    private Long Userid;
    private String title;
    private String completed;
}
