package com.study.spingbootservlet.service;

import com.study.spingbootservlet.dto.TodoRequestDto;
import com.study.spingbootservlet.dto.TodoRespnoseDto;
import com.study.spingbootservlet.mapper.TodoMapper;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    public TodoRespnoseDto findAll(){
        return TodoRespnoseDto.form(TodoMapper.findAll());
    }

    public TodoRespnoseDto save(TodoRequestDto request){
        Todo todo = new Todo(
                null,request.getUserid(),request.getTitle(),request.getCompleted());
        TodoMapper.save(todo);
        return TodoRespnoseDto.form(todo);
    }

}
