package com.demo.auth.model.projection;

import java.time.LocalDateTime;
import java.util.UUID;

import com.demo.auth.arch.utils.DateFormatterUtil;

public class UserSingUpProjection {
    
    private final UUID id;
    private final LocalDateTime created;
    private final LocalDateTime modified;
    private final LocalDateTime last_login;
    private final String token;
    private final boolean isactive;

    public UserSingUpProjection(  UUID id, 
                            LocalDateTime created, 
                            LocalDateTime modified, 
                            LocalDateTime lastLogin,
                            String token, 
                            boolean isActive) {
        this.id = id;
        this.created = created;
        this.modified = modified;
        this.last_login = lastLogin;
        this.token = token;
        this.isactive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public String getCreated() {
        return  DateFormatterUtil.format(created);
    }

    public String getModified() {
        return  DateFormatterUtil.format(modified);
    }

    public String getLast_login() {
        return  DateFormatterUtil.format(last_login);
    }
    
    
    

    
}
