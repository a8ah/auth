package com.demo.auth.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.demo.auth.arch.entity.BaseEntity;

@Entity
@Table( name = "users")
public class User extends BaseEntity{

    @Column(name = "last_login")
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
    
}
