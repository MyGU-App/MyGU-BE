package com.mygu.mygube.dtos.response;

import lombok.Getter;

@Getter
public class MyGUResponseSuccess<D> {
    private final boolean status = true;
    private final D data;

    public MyGUResponseSuccess(D data) {
        this.data = data;
    }
}
