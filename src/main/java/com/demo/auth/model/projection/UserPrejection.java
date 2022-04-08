package com.demo.auth.model.projection;

import java.time.LocalDateTime;
import java.util.UUID;

import com.demo.auth.arch.utils.DateFormatterUtil;

public class UserPrejection {
    
    private final UUID id;
    private final LocalDateTime created;
    private final LocalDateTime modified;
    private final LocalDateTime last_login;
    private final String token;
    private final boolean isactive;

    public UserPrejection(  UUID id, 
                            LocalDateTime created, 
                            LocalDateTime modified, 
                            LocalDateTime last_login,
                            String token, 
                            boolean isactive) {
        this.id = id;
        this.created = created;
        this.modified = modified;
        this.last_login = last_login;
        this.token = token;
        this.isactive = isactive;
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
