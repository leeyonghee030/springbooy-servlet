package com.study.spingbootservlet.mapper;

import com.study.spingbootservlet.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    //생성
    int save(User user);

    //전체조회
    List<User> findAll();

    //단건조회
    Optional<User> findById(long id);

    //삭제
    void deleteById(long id);
}
