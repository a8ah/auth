package com.demo.auth.model.projection;

import javax.validation.constraints.Pattern;

public class PhoneRequest {

    @Pattern(regexp="\\d{6,}")
    private String number;

    @Pattern(regexp="\\d+")
    private String citycode;

    @Pattern(regexp="\\d+")
    private String contrycode;
    
    public PhoneRequest() {
    }

    public PhoneRequest(String number, String citycode, String contrycode) {
        this.number = number;
        this.citycode = citycode;
        this.contrycode = contrycode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getContrycode() {
        return contrycode;
    }

    public void setContrycode(String contrycode) {
        this.contrycode = contrycode;
    }
        
}
