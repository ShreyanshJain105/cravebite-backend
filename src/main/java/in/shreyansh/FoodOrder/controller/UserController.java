package in.shreyansh.FoodOrder.controller;


import in.shreyansh.FoodOrder.io.UserRequest;
import in.shreyansh.FoodOrder.io.UserResponse;
import in.shreyansh.FoodOrder.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request){
       return userService.registerUser(request);


    }
}
