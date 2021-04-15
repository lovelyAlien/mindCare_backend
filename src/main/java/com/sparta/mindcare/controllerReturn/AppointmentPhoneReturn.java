package com.sparta.mindcare.controllerReturn;

import lombok.Getter;

@Getter
public class AppointmentPhoneReturn {
    private Boolean ok;
    private String results;
    private String msg;

    public AppointmentPhoneReturn(Boolean ok, String results, String msg){
        this.ok = ok;
        this.results = results;
        this.msg = msg;
    }
}
