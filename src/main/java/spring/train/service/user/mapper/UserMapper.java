package spring.train.service.user.mapper;

import spring.train.dto.UserResponseDto;
import spring.train.model.User;

public interface UserMapper {
    UserResponseDto mapUserToDto(User user);
}
