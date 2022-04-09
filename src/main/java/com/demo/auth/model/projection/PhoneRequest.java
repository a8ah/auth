package com.demo.auth.model.projection;

import com.demo.auth.arch.utils.validators.digits.CustomDigits;
import com.demo.auth.arch.utils.validators.phone.CustomPhone;

public class PhoneRequest {

    @CustomPhone
    @CustomDigits
    private String number;

    @CustomDigits
    private String citycode;

    @CustomDigits
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
