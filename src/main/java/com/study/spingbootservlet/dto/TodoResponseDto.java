package com.study.spingbootservlet.dto;

import com.study.spingbootservlet.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class TodoResponseDto {
    public long id;
    public long userId;
    public String title;
    public boolean completed;


    //Todo import 안하면 Todo 못들고옴
    public static TodoResponseDto from(Todo todo) {
        TodoResponseDto dto = new TodoResponseDto();
        dto.setId(todo.getId());
        dto.setUserId(todo.getUserId());
        dto.setTitle(todo.getTitle());
        dto.setCompleted(todo.isCompleted());
        return dto;
    }

}
