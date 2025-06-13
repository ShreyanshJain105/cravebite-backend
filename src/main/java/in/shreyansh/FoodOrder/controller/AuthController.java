package in.shreyansh.FoodOrder.controller;

import in.shreyansh.FoodOrder.io.AuthenticationRequest; // Should be AuthenticationRequest for login
import in.shreyansh.FoodOrder.io.AuthenticationResponse;
import in.shreyansh.FoodOrder.service.AppUserDetailsService;
import in.shreyansh.FoodOrder.util.JwtUtil; // You need this utility class
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final AppUserDetailsService userDetailsService;
    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody AuthenticationRequest request){ // Should be AuthenticationRequest
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
        final String jwtToken = jwtUtil.generateToken(userDetails); // Use jwtUtil to generate token
        return new AuthenticationResponse(request.getEmail(),jwtToken); // Adjust based on your AuthenticationResponse constructor
    }
}