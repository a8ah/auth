package com.demo.auth.model.projection;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import com.demo.auth.arch.utils.validators.email.CustomEmail;
import com.demo.auth.arch.utils.validators.password.CustomPassword;
public class UserSingUpRequest {

    @NotBlank
    private String name;

    @CustomEmail
    private String email;

    @CustomPassword
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
