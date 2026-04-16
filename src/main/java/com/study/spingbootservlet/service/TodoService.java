package com.study.spingbootservlet.service;

import com.study.spingbootservlet.dto.TodoRequestDto;
import com.study.spingbootservlet.dto.TodoResponseDto;
import com.study.spingbootservlet.entity.Todo;
import com.study.spingbootservlet.mapper.TodoMapper;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class TodoService {
    private final TodoMapper todoMapper;

    public TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public List<TodoResponseDto> findAll(){
      return   todoMapper.findAll().stream().map(
              TodoResponseDto :: from).toList();
    }

    public List<TodoResponseDto> findByUserId(Long userId){
        List<Todo> todos = todoMapper.findByUserId(userId);
        if (todos.isEmpty()){
            throw new IllegalArgumentException("해당 Todo가없습니다. userId="+userId);
        }
        return todos.stream().map(TodoResponseDto::from).toList();
    }

    public TodoResponseDto findById(Long id){
        Todo todo = todoMapper.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 Todo가 없습니다. id="+id));
        return TodoResponseDto.from(todo);
    }
    //생성
    public TodoResponseDto create(TodoRequestDto request){
        Todo todo = new Todo(null,request.getUserId(),
                request.getTitle(), request.isCompleted());
        todoMapper.save(todo);
        //이과정에서 자동으로 id 를 채워줘서 todo로 바로 form가능
      return TodoResponseDto.from(todo);

    }
    //수정
    public TodoResponseDto update(Long id, TodoRequestDto request){
       todoMapper.findById(id).orElseThrow(
               ()-> new IllegalArgumentException("확인되는 Todo가없습니다. id="+id));
       Todo todo = new Todo(id,request.getUserId(),request.getTitle(),
               request.isCompleted());
       todoMapper.update(todo);
       return TodoResponseDto.from(todo);
    }
    //삭제
    public void delete(Long id){
        todoMapper.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("확인되는 Todo가없습니다. id="+id));
        todoMapper.deleteById(id);
    }
}
