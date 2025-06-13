package in.shreyansh.FoodOrder.service;

import in.shreyansh.FoodOrder.io.UserRequest;
import in.shreyansh.FoodOrder.io.UserResponse;


public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}