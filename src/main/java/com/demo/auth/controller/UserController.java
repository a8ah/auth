package com.demo.auth.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.demo.auth.model.projection.UserSingUpProjection;
import com.demo.auth.model.projection.UserSingUpRequest;
import com.demo.auth.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apiv1")
public class UserController {
    @Autowired
    UserService mUserService;

    @PostMapping("singup")
    public UserSingUpProjection crear(@RequestBody @Valid UserSingUpRequest entity) throws Exception {
        try {
             return mUserService.singUpUser(entity);
        // final boolean result = mService.crear(entidad, principal);
        // return new SuccessResponse(result, "", entidad.getId());
        } catch (Exception ex) {
        // if (logger.isErrorEnabled()) {
        //     logger.error(ex);;
        // }

        throw  new Exception(ex.getMessage());
        }
    }

    @PutMapping("edit/{id}")
    public void edit(@PathVariable UUID id, @RequestBody @Valid UserSingUpProjection entity) {
        // try {
        // final boolean result = mService.modificar(id, entidad, principal);
        // return new SuccessResponse(result);
        // } catch (Exception ex) {
        // if (logger.isErrorEnabled()) {
        //     logger.error(ex);;
        // }

        // return new SuccessResponse(false, ex.getMessage());
        // }

    }

    // @GetMapping("users")
    // public List<UserPrejection> all(@RequestParam(required = false) String q,
    //                         @PageableDefault Pageable page) {
    //     final var specification = new EstadoSpecification(q);
    //     return mEstadoPagination.paginate(specification, page);
    // }
    
}
