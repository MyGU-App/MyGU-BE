package com.mygu.mygube.dtos.response;

import com.mygu.mygube.exceptions.MyGUException;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class MyGUResponseFail {
    private final boolean status = false;
    private final Object errors;

    public MyGUResponseFail(Object errors) {
        this.errors = errors;
    }
}
