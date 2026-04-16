package com.study.spingbootservlet.dto;
import com.study.spingbootservlet.entity.Todo
public class TodoRespnoseDto {
    TodoRespnoseDto todoRespnoseDto;

    private Long id;
    private Long userId;
    private String title;
    private boolean completed;

    public TodoRequestDto form(Todo todo){
        TodoRequestDto todoRequestDto = new TodoRequestDto(
                todo.getid, todo.getuserId,todo.getitle,todo.iscompleted;
        )
        return todoRequestDto;
    }
}
