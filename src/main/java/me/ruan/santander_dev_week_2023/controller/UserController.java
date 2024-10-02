package me.ruan.santander_dev_week_2023.controller;

import me.ruan.santander_dev_week_2023.model.User;
import me.ruan.santander_dev_week_2023.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id ) throws NoSuchMethodException {
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }


    @PostMapping("/new")
    public ResponseEntity<User> create(@RequestBody User userToCreate ) throws NoSuchMethodException {
        User userCreate = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreate);
    }

}
