package com.mygu.mygube.dtos.response;

public interface EntityDTO<E,R> {
    R fromEntity(E entity);
}