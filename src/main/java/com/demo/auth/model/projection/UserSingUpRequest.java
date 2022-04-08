package com.demo.auth.model.projection;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.demo.auth.arch.utils.DateFormatterUtil;
import com.demo.auth.model.entity.Phone;



public class UserSingUpRequest {

    private String name;

    @NotBlank
    // @Email
    
    @Pattern(regexp = "^([a-z]*)@dominio.cl$")
    private String email;

    @Pattern(regexp = "^([A-Z])([a-z]{3})([0-9]{2})$")
    private String password;
    
    @Valid
    private List<PhoneRequest> phones;
    
    public UserSingUpRequest() {
    }

    public UserSingUpRequest(String name, String email, String password, List<PhoneRequest> phones) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<PhoneRequest> getPhones() {
        return phones;
    }
    public void setPhones(List<PhoneRequest> phones) {
        this.phones = phones;
    }

    
}
