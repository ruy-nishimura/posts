package br.com.ruy.posts.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.ruy.posts.dto.UsuarioDto;
import br.com.ruy.posts.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping(path="/post")
@RequiredArgsConstructor
public class PostContoller {
    private final UserService userService;
    @PostMapping(path="/user")
    public @ResponseBody String postUser(@RequestBody UsuarioDto usuario) {
        userService.saveUser(usuario);
        return ResponseEntity.created(null).build().toString();
    }
    
}
