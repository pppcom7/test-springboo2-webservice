package com.pppcom7.book.springbook.web.dto;

import org.junit.Test;

import java.util.Objects;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void test_lombok(){
        String name="test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName().equals(name));
        assertThat(Objects.equals(dto.getAmount(), amount));
    }
}
