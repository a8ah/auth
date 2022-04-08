package com.demo.auth.model.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.demo.auth.arch.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name = "phones")
public class Phone  extends BaseEntity{
    
    protected String number;

    @Column(name = "city_code")
    protected Long cityCode;
    
    @Column(name = "contry_code")
    protected Long contryCode;

    @JsonIgnore
    @ManyToOne(optional = false)
    private User user;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public Long getContryCode() {
        return contryCode;
    }

    public void setContryCode(Long contryCode) {
        this.contryCode = contryCode;
    }
}
