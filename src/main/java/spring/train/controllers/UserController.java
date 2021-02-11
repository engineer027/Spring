package spring.train.controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.train.dto.UserResponseDto;
import spring.train.model.User;
import spring.train.service.UserService;
import spring.train.service.user.mapper.UserMapper;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper mapper;

    public UserController(UserService userService, UserMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable Long userId) {
        return mapper.mapUserToDto(userService.get(userId));
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.listUsers()
                .stream()
                .map(mapper::mapUserToDto)
                .collect(Collectors.toList());

    }

    @GetMapping("/inject")
    public String inject() {
        User bob = new User("Bob", "Bobchuk", "bob@gmail.com");
        userService.add(bob);
        User alice = new User("Pavlo", "Zibrov", "pavlo@gmail.com");
        userService.add(alice);
        User kate = new User("Elon", "Musk", "musk@gmail.com");
        userService.add(kate);
        User john = new User("Ivo", "Bobul", "bobul@gmail.com");
        userService.add(john);
        return "users was inject";
    }
}
