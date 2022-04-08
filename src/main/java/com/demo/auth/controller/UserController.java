package com.demo.auth.controller;

import java.util.List;

import com.demo.auth.model.projection.UserPrejection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apiv1")
public class UserController {

    // @GetMapping("users")
    // public List<UserPrejection> all(@RequestParam(required = false) String q,
    //                         @PageableDefault Pageable page) {
    //     final var specification = new EstadoSpecification(q);
    //     return mEstadoPagination.paginate(specification, page);
    // }
    
}
