package com.bmstu.flowrence.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@RequiredArgsConstructor
public class SimpleResponse implements SimpleDto {

    private final String text;
    private final String name;

    @Override
    public String printMessage() {
        System.out.println("SUkA");
        return "Padla";
    }
}
