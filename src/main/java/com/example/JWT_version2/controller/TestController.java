package com.example.JWT_version2.controller;

import com.example.JWT_version2.entity.User;
import com.example.JWT_version2.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class TestController {

    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<?> hello(@RequestParam Integer id){
        User user = userRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("Notfound ok")
        );
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping("/concho")
    public ResponseEntity<?> concho(){
        return ResponseEntity.ok("hello con cho");
    }
}
