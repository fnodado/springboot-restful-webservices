package net.javaguides.springboot.mapper;

import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

public class UserMapper {

    public static User mapToUser(UserDto user) {
        User userJpa = new User();
        userJpa.setId(user.getId());
        userJpa.setEmail(user.getEmail());
        userJpa.setFirstName(user.getFirstName());
        userJpa.setLastName(user.getLastName());
        return userJpa;
    }

    public static UserDto mapToUserDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());

        return dto;
    }

}
