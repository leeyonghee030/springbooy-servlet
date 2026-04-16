package com.study.spingbootservlet.mapper;

import com.study.spingbootservlet.entity.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TodoMapper {
    //생성
    int save(Todo todo);
    //수정
    int update(Todo todo);
    //전체조회
    List<Todo> findAll();
    //단건조회
    Optional<Todo> findById(Long id);
    //유저이름 조회
    List<Todo> findByUserId(Long userId);
    //삭제
    void deleteById(Long id);
}
