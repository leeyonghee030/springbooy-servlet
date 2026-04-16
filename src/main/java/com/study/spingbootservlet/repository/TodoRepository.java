package com.study.spingbootservlet.repository;

import com.study.spingbootservlet.entity.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoRepository {
    public void save(Todo todo);

    public List<Todo> findAll();

}
