package com.study.spingbootservlet.controller;

import com.study.spingbootservlet.dto.UserRequestDto;
import com.study.spingbootservlet.dto.UserResponseDto;
import com.study.spingbootservlet.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
@GetMapping
    public List<UserResponseDto> getAll(){
        return userService.findAll();
    }
@GetMapping("/{id}")
    public UserResponseDto getById(@PathVariable Long id){
        return userService.findById(id);
    }
@PostMapping
    public UserResponseDto create(@RequestBody UserRequestDto request){
        return userService.create(request);
    }
@DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
