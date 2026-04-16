package com.study.spingbootservlet.service;

import com.study.spingbootservlet.dto.UserRequestDto;
import com.study.spingbootservlet.dto.UserResponseDto;
import com.study.spingbootservlet.entity.User;
import com.study.spingbootservlet.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserResponseDto> findAll() {
        return userMapper.findAll().stream().map(
                UserResponseDto::from).toList();
    }

    public UserResponseDto findById(long id) {
        User user = userMapper.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 user는 없습니다 id=" + id));
        return UserResponseDto.from(user);
    }

    public UserResponseDto create(UserRequestDto request) {
        User user = new User(null, request.getUserName(), request.getEmail());
        userMapper.save(user);
        return UserResponseDto.from(user);
    }

    public void delete(long id) {
        userMapper.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 user는 없습니다 id=" + id));
        userMapper.deleteById(id);
    }
}
