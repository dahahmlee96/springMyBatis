package com.example.springbootmybatispractice.controller;

import com.example.springbootmybatispractice.model.UserDto;
import com.example.springbootmybatispractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/")
    public ModelAndView main(Model model) {
        List<UserDto> list = service.getList();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        mav.addObject("list", list);

        return mav;
    }
}
