package com.demo.auth.model.entity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.demo.auth.arch.entity.BaseEntity;

@Entity
@Table( name = "users")
public class User extends BaseEntity {

    // @Min(4)
    // @Max(20)
    protected String name;
    
    @Email
    @Column(nullable = false, unique = true)
    protected String email;

    @NotBlank
    protected String password;
    
    @Column(name = "last_login", nullable = false, updatable = false)
    protected LocalDateTime lastLogin;

    @Column(name = "is_active")
    protected boolean isActive;

    protected String token;

    @OneToMany()
    private List<Phone> phones;

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // @Override
    // public Collection<? extends GrantedAuthority> getAuthorities() {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    // @Override
    // public String getUsername() {
    //     return getUsername();
    // }

    // @Override
    // public boolean isAccountNonExpired() {
    //     return true;
    // }

    // @Override
    // public boolean isAccountNonLocked() {
    //     return !getIsActive();
    // }

    // @Override
    // public boolean isCredentialsNonExpired() {
    //    return true;
    // }

    // @Override
    // public boolean isEnabled() {
    //    return getIsActive();
    // }
    
}
