package com.study.spingbootservlet.dto;

import com.study.spingbootservlet.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class UserResponseDto {
    private Long id;
    private String userName;
    private String email;

    public static UserResponseDto from(User user){
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setUserName(user.getUserName());
        dto.setEmail(user.getEmail());
        return dto;
    }
}
