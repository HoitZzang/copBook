package com.study.copBook.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount)
    {
        return new HelloResponseDto(name, amount);
    }
}
