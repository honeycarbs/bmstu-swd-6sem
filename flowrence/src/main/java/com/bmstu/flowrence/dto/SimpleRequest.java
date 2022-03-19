package com.bmstu.flowrence.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SimpleRequest implements SimpleDto {
    private final String name;

    @Override
    public String printMessage() {
        String message = "ITZ A MSB FROM CLAZZ";
        System.out.println(message);
        return message;
    }
}
