package spring.train.service.user.mapper;

import org.springframework.stereotype.Component;
import spring.train.UserResponseDto;
import spring.train.model.User;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponseDto mapUserToDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setEmail(user.getEmail());
        return dto;
    }
}
