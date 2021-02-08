package spring.train;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.train.config.AppConfig;
import spring.train.model.User;
import spring.train.service.UserService;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setFirstName("bob");
        bob.setLastName("Bond");
        bob.setEmail("bob@gmail.com");

        User pavlo = new User();
        pavlo.setFirstName("pavlo");
        pavlo.setLastName("Zibrov");
        pavlo.setEmail("pavlo@gmail.com");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(pavlo);

        List<User> users = userService.listUsers();
        for (User user: users) {
            System.out.println(user.toString());
        }
    }
}
