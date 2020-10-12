package com.shinta.latihan.assembler;

public interface InterfaceAssembler <A, B> {

    A fromDto(B dto);

    B fromEntity(A entity);
}
