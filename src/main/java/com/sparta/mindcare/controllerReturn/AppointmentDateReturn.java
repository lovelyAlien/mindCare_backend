package com.sparta.mindcare.controllerReturn;

import lombok.Getter;

import java.util.List;

@Getter
public class AppointmentDateReturn {
    private Boolean ok;
    private List<AppointmentTimeCheck> results;
    private String msg;

    public AppointmentDateReturn(Boolean ok, List<AppointmentTimeCheck> results,String msg){
        this.ok = ok;
        this.results = results;
        this.msg = msg;
    }
}
